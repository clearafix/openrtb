package com.clearafix.openrtb.model

/**
  * Represents the most general type of impression. It can be many things including a simple static image,
  * an expandable ad unit, or even in-banner video.
  *
  * @param format list of {@link com.clearafix.openrtb.model.Format formats}. If none are specified, then use of the h and w attributes is highly recommended.
  * @param w      width in pixels. If no format objects are specified, this is an exact width requirement.
  * @param h      height in pixels. If no format objects are specified, this is an exact height requirement.
  * @deprecated wmax Deprecated in favor of the format array.
  * @deprecated hmax Deprecated in favor of the format array.
  * @deprecated wmin Deprecated in favor of the format array.
  * @deprecated hmin Deprecated in favor of the format array.
  * @param btype    Blocked banner ad types
  * @param battr    Blocked creative attributes
  * @param pos      Ad position on screen
  * @param mimes    Content MIME types supported
  * @param topframe Indicates if the banner is in the top frame as opposed to an iframe, where 0 = no, 1 = yes.
  * @param expdir   Directions in which the banner may expand
  * @param api      array of supported API frameworks for this impression
  * @param id       ID should be unique within an impression
  * @param vcm      companion banner rendering mode relative to the associated video ( 0 = concurrent, 1 = end-card). Relevant only for {@link com.clearafix.openrtb.model.Banner banner} used with {@link com.clearafix.openrtb.model.Video video}.
  * @param ext      Placeholder for exchange-specific extensions to OpenRTB
  */
case class Banner(
                   format: Option[Seq[Format]] = None,
                   w: Option[Int] = None,
                   h: Option[Int] = None,
                   @deprecated wmax: Option[Int] = None,
                   @deprecated hmax: Option[Int] = None,
                   @deprecated wmin: Option[Int] = None,
                   @deprecated hmin: Option[Int] = None,
                   btype: Option[Seq[Int]] = None,
                   battr: Option[Seq[Int]] = None,
                   pos: Option[Int] = None,
                   mimes: Option[Seq[String]] = None,
                   topframe: Option[Int] = None,
                   expdir: Option[Seq[Int]] = None,
                   api: Option[Seq[Int]] = None,
                   id: Option[String] = None,
                   vcm: Option[Int] = None,
                   ext: Ext = None
                 )