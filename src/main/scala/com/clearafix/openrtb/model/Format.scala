package com.clearafix.openrtb.model

/**
  * Representation of banner's allowed size.
  *
  * @param w   width in pixels
  * @param h   height in pixels
  * @param ext Placeholder for exchange-specific extensions to OpenRTB
  */


/**
  * Representation of banner's allowed size.
  *
  * @param w width in pixels
  * @param h height in pixels
  * @param wratio relative width when expressing size as a ratio.
  * @param hratio relative height when expressing size as a ratio.
  * @param wmin  minimum width in device independent pixels (DIPS) at which the ad will be displayed the size is expressed as a ratio
  * @param ext Placeholder for exchange-specific extensions to OpenRTB
  */
case class Format(
                   w: Option[Int] = None,
                   h: Option[Int] = None,
                   wratio: Option[Int] = None,
                   hratio: Option[Int] = None,
                   wmin: Option[Int] = None,
                   ext: Ext = None
                 )