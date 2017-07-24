package com.clearafix.openrtb.model

/**
  * Legal, governmental, or industry regulations that apply to the request.
  *
  * @param coppa Flag indicating if this request is subject to the COPPA
  * @param ext Placeholder for exchange-specific extensions to OpenRTB
  */
case class Regs(
               coppa:   Option[Int] = None,
               ext:     Option[Ext] = None
               )
{
}
