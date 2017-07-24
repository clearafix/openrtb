package com.clearafix.openrtb.model

/**
  * Represents additional data about the user.
  *
  * @param id of the data segment specific to the data provider
  * @param name of the data segment specific to the data provider
  * @param value representation of the data segment value
  * @param ext Placeholder for exchange-specific extensions to OpenRTB
  */
case class Segment(
                  id:     Option[String] = None,
                  name:   Option[String] = None,
                  value:  Option[String] = None,
                  ext:    Option[Ext] = None
                  )
{
}
