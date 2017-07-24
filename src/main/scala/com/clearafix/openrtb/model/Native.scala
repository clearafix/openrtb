package com.clearafix.openrtb.model

/**
  * Representation of native ad impression type. Native ad units are intended to blend seamlessly into the surrounding
  * content (e.g., a sponsored Twitter or Facebook post). As such, the response must be well-structured to afford
  * the publisher fine-grained control over rendering.
  *
  * @param request Request payload complying with the Native Ad Specification
  * @param ver     Version of the Dynamic Native Ads API to which request complies; highly recommended for efficient parsing.
  * @param api     array of supported API frameworks for this impression
  * @param battr   Blocked creative attributes
  * @param ext     Placeholder for exchange-specific extensions to OpenRTB
  */
case class Native(
                   request: String = "",
                   ver: Option[String] = None,
                   api: Option[Seq[Int]] = None,
                   battr: Option[Seq[Int]] = None,
                   ext: Option[Ext] = None
                 )