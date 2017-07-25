package com.clearafix.openrtb.model

/**
  * A {@link com.clearafix.openrtb.model.SeatBid SeatBid} object contains one or more Bid objects, each of which relates to a specific impression in the
  * bid request via the impid attribute and constitutes an offer to buy that impression for a given price.
  *
  * @param id
  * @param impid
  * @param price
  * @param nurl
  * @param burl
  * @param lurl
  * @param adm
  * @param adid
  * @param adomain
  * @param bundle
  * @param iurl
  * @param cid
  * @param crid
  * @param tactic
  * @param cat
  * @param attr
  * @param api
  * @param protocol
  * @param qagmediarating
  * @param language
  * @param dealid
  * @param w
  * @param h
  * @param wratio
  * @param hratio
  * @param exp
  * @param ext
  */
case class Bid(
                id: String,
                impid: String,
                price: Double,
                nurl: Option[String] = None,
                burl: Option[String] = None,
                lurl: Option[String] = None,
                adm: Option[String] = None,
                adid: Option[String] = None,
                adomain: Option[Seq[String]] = None,
                bundle: Option[String] = None,
                iurl: Option[String] = None,
                cid: Option[String] = None,
                crid: Option[String] = None,
                tactic: Option[String] = None,
                cat: Option[Seq[String]] = None,
                attr: Option[Seq[Int]] = None,
                api: Option[Int] = None,
                protocol: Option[Int] = None,
                qagmediarating: Option[Int] = None,
                language: Option[String]= None,
                dealid: Option[String] = None,
                w: Option[Int] = None,
                h: Option[Int] = None,
                wratio: Option[Int] = None,
                hratio: Option[Int] = None,
                exp: Option[Int] = None,
                ext: Ext = None
              )
{
  require(!id.isEmpty && !impid.isEmpty && price >=0)
}