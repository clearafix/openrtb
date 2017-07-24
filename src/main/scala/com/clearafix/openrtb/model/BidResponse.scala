package com.clearafix.openrtb.model

/**
  * Representation of a bid response.
  *
  * @param id         ID of the bid request to which this is a response
  * @param seatbid    list of seatbid objects
  * @param bidid      Bidder generated response ID to assist with logging/tracking
  * @param cur        Bid currency using ISO-4217 alpha codes
  * @param customdata Optional feature to allow a bidder to set data in the exchange’s cookie. The string must be in base85 cookie safe characters and be in any format. Proper JSON encoding must be used to include “escaped” quotation marks
  * @param nbr        Reason for not bidding
  * @param ext        Placeholder for bidder-specific extensions to OpenRTB
  */
case class BidResponse(
                        id: String = "",
                        seatbid: Option[Seq[SeatBid]] = None,
                        bidid: Option[String] = None,
                        cur: Option[String] = None,
                        customdata: Option[String] = None,
                        nbr: Option[Int] = None,
                        ext: Option[Ext] = None
                      )