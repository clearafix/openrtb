package com.clearafix.openrtb.model

/**
  * Represents the most general type of impression. It can be many things including a simple static image,
  * an expandable ad unit, or even in-banner video.
  *
  * @param w      width in pixels. If no format objects are specified, this is an exact width requirement.
  * @param h      height in pixels. If no format objects are specified, this is an exact height requirement.
  * @param format list of Format objects. If none are specified, then use of the h and w attributes is highly recommended.
  * @deprecated wmax Deprecated in favor of the format array.
  * @deprecated hmax Deprecated in favor of the format array.
  * @deprecated wmin Deprecated in favor of the format array.
  * @deprecated hmin Deprecated in favor of the format array.
  * @param id       ID should be unique within an impression
  * @param btype    Blocked banner ad types
  * @param battr    Blocked creative attributes
  * @param pos      Ad position on screen
  * @param mimes    Content MIME types supported
  * @param topframe Indicates if the banner is in the top frame as opposed to an iframe, where 0 = no, 1 = yes.
  * @param expdir   Directions in which the banner may expand
  * @param api      array of supported API frameworks for this impression
  * @param ext      Placeholder for exchange-specific extensions to OpenRTB
  */
case class Banner(
                   w: Option[Int] = None,
                   h: Option[Int] = None,
                   format: Option[Seq[Format]] = None,
                   @deprecated wmax: Option[Int] = None,
                   @deprecated hmax: Option[Int] = None,
                   @deprecated wmin: Option[Int] = None,
                   @deprecated hmin: Option[Int] = None,
                   id: Option[String] = None,
                   btype: Option[Seq[Int]] = None,
                   battr: Option[Seq[Int]] = None,
                   pos: Option[Int] = None,
                   mimes: Option[Seq[String]] = None,
                   topframe: Option[Int] = None,
                   expdir: Option[Seq[Int]] = None,
                   api: Option[Seq[Int]] = None,
                   ext: Option[Ext] = None
                 )