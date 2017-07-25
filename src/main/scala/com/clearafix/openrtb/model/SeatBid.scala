package com.clearafix.openrtb.model

/**
  * A bid response can contain multiple SeatBid objects, each on behalf of a different bidder seat and each containing
  * one or more individual {@link com.clearafix.openrtb.model.Bid bids}. If multiple impressions are presented in the request, the group attribute can be used
  * to specify if a seat is willing to accept any impressions that it can win (default) or if it is only interested
  * in winning any if it can win them all as a group.
  *
  * @param bid array of {@link com.clearafix.openrtb.model.Bid Bid} objects
  * @param seat
  * @param group
  * @param ext
  */
case class SeatBid(
                  bid: Seq[Bid],
                  seat: Option[String],
                  group: Option[Int] = Some(0),
                  ext: Ext = None
                  )