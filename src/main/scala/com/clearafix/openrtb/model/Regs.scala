package com.clearafix.openrtb.model

/**
  * Legal, governmental, or industry regulations that apply to the request. The coppa flag signals whether or not the
  * request falls under the United States Federal Trade Commission’s regulations for the United States Children’s
  * Online Privacy Protection Act (“COPPA”)
  *
  * @param coppa Flag indicating if this request is subject to the COPPA
  * @param ext   Placeholder for exchange-specific extensions to OpenRTB
  */
case class Regs(
                 coppa: Option[Int] = None,
                 ext: Ext = None
               )