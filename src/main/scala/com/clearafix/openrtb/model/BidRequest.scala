package com.clearafix.openrtb.model

/**
  * com.clearafix.openrtb.model.BidRequest represents a request from the Exchange.
  *
  * @param id Unique ID of the bid request, provided by the exchange
  * @param imp Collection of impressions offered. At least 1 is required.
  * @param site Details about the publisher’s website. Only applicable and recommended for websites.
  * @param app Details about the publisher’s app. Only applicable and recommended for apps
  * @param device Details about the user’s device to which the impression will be delivered.
  * @param user Details about the human user of the device
  * @param test Indicator of test mode in which auctions are not billable, where 0 = live mode, 1 = test mode.
  * @param at Auction type, where 1 = First Price, 2 = Second Price Plus. Exchange-specific auction types can be
  *           defined using values greater than 500.
  * @param tmax Maximum time in milliseconds to submit a bid to avoid timeout. This value is commonly
  *             communicated offline.
  * @param wseat Whitelist of buyer seats allowed to bid on this impression. Omission implies no seat restrictions
  * @param allimps Flag to indicate if Exchange can verify that the impressions offered represent all of the
  *                impressions available in context to support road-blocking. 0 = no or unknown, 1 = yes,
  *                the impressions offered represent all that are available.
  * @param cur Array of allowed currencies for bids on this bid request using ISO-4217 alpha codes.
  *            Recommended only if the exchange accepts multiple currencies.
  * @param bcat Blocked advertiser categories using the IAB content categories.
  * @param badv Block list of advertisers by their domains (e.g., “example.com”).
  * @param bapp Block list of applications by their platform-specific exchange-independent application identifiers.
  *             On Android, these should be bundle or package names (e.g., com.foo.mygame).
  *             On iOS, these are numeric IDs.
  * @param regs Specifies any industry, legal or governmental regulations in force for this request
  * @param ext Placeholder for exchange-specific extensions to OpenRTB
  */
case class BidRequest(
                      id:       String = "",
                      imp:      List[Imp] = List(),
                      site:     Option[Site] = None,
                      app:      Option[App]= None,
                      device:   Option[Device] = None,
                      user:     Option[User] = None,
                      test:     Option[Int] = None,
                      at:       Option[Int] = None,
                      tmax:     Option[Int] = None,
                      wseat:    Option[List[String]] = None,
                      allimps:  Option[Int] = None,
                      cur:      Option[List[String]] = None,
                      bcat:     Option[List[String]] = None,
                      badv:     Option[List[String]] = None,
                      bapp:     Option[List[String]] = None,
                      regs:     Option[Regs] = None,
                      ext:      Option[Ext] = None
                     )
{

}

object BidRequest{
  def withDefaults() : BidRequest = BidRequest(test = Some(0), at = Some(2), allimps = Some(0)
  )
}
