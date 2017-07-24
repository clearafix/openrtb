package com.clearafix.openrtb.model

/**
  * BidRequest is a high-level object that represents a standard request from the Exchange asking a for a {@link com.clearafix.openrtb.model.BidResponse bid}.
  *
  * @param id      Unique ID of the bid request, provided by the exchange
  * @param imp     Collection of {@link com.clearafix.openrtb.model.Imp impressions} offered. At least 1 is required.
  * @param site    Details about the publisher’s {@link com.clearafix.openrtb.model.Site website}. Only applicable and recommended for websites.
  * @param app     Details about the publisher’s {@link com.clearafix.openrtb.model.App app}.Only applicable and recommended for apps
  * @param device  Details about the user’s {@link com.clearafix.openrtb.model.Device device} to which the impression will be delivered.
  * @param user    Details about the human {@link com.clearafix.openrtb.model.User user} of the device
  * @param test    Indicator of test mode in which auctions are not billable, where 0 = live mode, 1 = test mode.
  * @param at      Auction type, where 1 = First Price, 2 = Second Price Plus. Exchange-specific auction types can be defined using values greater than 500.
  * @param tmax    Maximum time in milliseconds to submit a bid to avoid timeout. This value is commonly communicated offline.
  * @param wseat   WhiteSeq of buyer seats allowed to bid on this impression. Omission implies no seat restrictions
  * @param allimps Flag to indicate if Exchange can verify that the impressions offered represent all of the impressions available in context to support road-blocking. 0 = no or unknown, 1 = yes, the impressions offered represent all that are available.
  * @param cur     Array of allowed currencies for bids on this bid request using ISO-4217 alpha codes. Recommended only if the exchange accepts multiple currencies.
  * @param wlang   Array of whitelisted languages for creatives corresponding to ISO-639-1-alpha-2. No specific restrictions if not present, but consider {@code language} attribute in the {@link com.clearafix.openrtb.model.Device Device} and/or {@link com.clearafix.openrtb.model.Content Content} objects.
  * @param bcat    Blocked advertiser categories using the IAB content categories.
  * @param badv    Block Seq of advertisers by their domains (e.g., “example.com”).
  * @param bapp    Block Seq of applications by their platform-specific exchange-independent application identifiers. On Android, these should be bundle or package names (e.g., com.foo.mygame). On iOS, these are numeric IDs.
  * @param source  An {@link com.clearafix.openrtb.model.Source object} that provides data about the inventory source and which entity makes the final decision.
  * @param regs    An {@link com.clearafix.openrtb.model.Regs object} that specifies any industry, legal or governmental regulations in force for this request
  * @param ext     {@link com.clearafix.openrtb.model.Ext Placeholder} for exchange-specific extensions to OpenRTB
  */
case class BidRequest(
                       id: String,
                       imp: Seq[Imp],
                       site: Option[Site] = None,
                       app: Option[App] = None,
                       device: Option[Device] = None,
                       user: Option[User] = None,
                       test: Option[Int] = Some(0),
                       at: Option[Int] = Some(2),
                       tmax: Option[Int] = None,
                       wseat: Option[Seq[String]] = None,
                       allimps: Option[Int] = Some(0),
                       cur: Option[Seq[String]] = None,
                       wlang: Option[Seq[String]] = None,
                       bcat: Option[Seq[String]] = None,
                       badv: Option[Seq[String]] = None,
                       bapp: Option[Seq[String]] = None,
                       source: Option[Source] = None,
                       regs: Option[Regs] = None,
                       ext: Option[Ext] = None
                     )
{
  require(!id.isEmpty && !imp.isEmpty)
}
