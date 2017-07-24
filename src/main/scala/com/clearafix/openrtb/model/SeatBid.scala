package com.clearafix.openrtb.model

/**
  *
  * @param id
  * @param impid
  * @param price
  * @param adid
  * @param nurl
  * @param adm
  * @param adomain
  * @param bundle
  * @param iurl
  * @param cid
  * @param crid
  * @param cat
  * @param attr
  * @param api
  * @param protocol
  * @param qagmediarating
  * @param dealid
  * @param w
  * @param h
  * @param exp
  * @param ext
  */
case class SeatBid(
                    id: Seq[Bid] = Seq(),
                    impid: String = "",
                    price: Float = 0,
                    adid: Option[String] = None,
                    nurl: Option[String] = None,
                    adm: Option[String] = None,
                    adomain: Option[Seq[String]] = None,
                    bundle: Option[String] = None,
                    iurl: Option[String] = None,
                    cid: Option[String] = None,
                    crid: Option[String] = None,
                    cat: Option[Seq[String]] = None,
                    attr: Option[Seq[Int]] = None,
                    api: Option[Int] = None,
                    protocol: Option[Int] = None,
                    qagmediarating: Option[Int] = None,
                    dealid: Option[String] = None,
                    w: Option[Int] = None,
                    h: Option[Int] = None,
                    exp: Option[Int] = None,
                    ext: Option[Ext] = None
                  )