package com.clearafix.openrtb.model

/**
  * Impression describes an ad placement or impression in the auction. Every impression must have an id.
  *
  * @param id unique within a context of bid request
  * @param banner required if this impression represents a banner ad
  * @param video required if this impression represents a video ad
  * @param audio required if this impression represents an audio ad
  * @param native required if this impression represents a native ad
  * @param pmp contains private marketplace deals in effect for this impression
  * @param displaymanager Name of ad mediation partner, SDK technology, or player responsible for rendering ad
  *                       (typically video or mobile). Used by some ad servers to customize ad code by partner.
  *                       Recommended for video and/or apps
  * @param displaymanagerver version of display manager
  * @param instl 1 = the ad is interstitial or full screen, 0 = not interstitial
  * @param tagid Identifier for specific ad placement or ad tag that was used to initiate the auction.
  *              This can be useful for debugging of any issues, or for optimization by the buyer
  * @param bidfloor Minimum bid for this impression expressed in CPM
  * @param bidfloorcur Currency specified using ISO-4217 alpha codes
  * @param clickbrowser Indicates the type of browser opened upon clicking the creative in an app,
  *                     where 0 = embedded, 1 = native
  * @param secure Flag to indicate if the impression requires secure HTTPS URL creative assets and markup,
  *               where 0 = non-secure, 1 = secure
  * @param iframebuster list of exchange-specific names of supported iframe busters
  * @param exp Advisory as to the number of seconds that may elapse between the auction and the actual impression
  * @param ext Placeholder for exchange-specific extensions to OpenRTB
  */
case class Imp(
               id:                String = "",
               banner:            Option[Banner] = None,
               video:             Option[Video] = None,
               audio:             Option[Audio] = None,
               native:            Option[Native] = None,
               pmp:               Option[Pmp] = None,
               displaymanager:    Option[String] = None,
               displaymanagerver: Option[String] = None,
               instl:             Option[Int] = None,
               tagid:             Option[String] = None,
               @JsonDeserialize(contentAs = classOf[java.lang.Float])
               bidfloor:          Option[Float] = None,
               bidfloorcur:       Option[String] = None,
               clickbrowser:      Option[Int] = None,
               secure:            Option[Int] = None,
               iframebuster:      Option[List[String]] = None,
               exp:               Option[Int] = None,
               ext:               Option[Ext] = None
              )
{
}

object Imp {
  def withDefaults() : Imp = Imp(instl = Some(0), bidfloor = Some(0), bidfloorcur = Some("USD")
  )
}