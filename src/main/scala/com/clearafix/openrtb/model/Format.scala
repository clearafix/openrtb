package com.clearafix.openrtb.model

/**
  * Representation of banner's allowed size.
  *
  * @param w   width in pixels
  * @param h   height in pixels
  * @param ext Placeholder for exchange-specific extensions to OpenRTB
  */
case class Format(
                   w: Option[Int] = None,
                   h: Option[Int] = None,
                   ext: Option[Ext] = None
                 )