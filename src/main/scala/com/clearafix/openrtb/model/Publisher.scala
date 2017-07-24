package com.clearafix.openrtb.model

/**
  * Represent the publisher of the media in which the ad will be displayed.
  *
  * @param id Exchange-specific publisher ID
  * @param name of the publisher
  * @param cat list of IAB content categories that describe the publisher
  * @param domain Highest level domain of the publisher
  * @param ext Placeholder for exchange-specific extensions to OpenRTB
  */
case class Publisher(
                    id:     Option[String] = None,
                    name:   Option[String] = None,
                    cat:    Option[List[String]] = None,
                    domain: Option[String] = None,
                    ext:    Option[Ext] = None
                    ) {

}
