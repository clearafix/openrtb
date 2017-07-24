package com.clearafix.openrtb.model

/**
  * Representation of producer of the content.
  *
  * @param id Content producer or originator ID
  * @param name Content producer or originator name
  * @param cat list of IAB content categories that describe the content producer
  * @param domain Highest level domain of the content producer
  * @param ext Placeholder for exchange-specific extensions to OpenRTB
  */
case class Producer(
                   id:      Option[String] = None,
                   name:    Option[String] = None,
                   cat:     Option[List[String]] = None,
                   domain:  Option[String] = None,
                   ext:     Option[Ext] = None
                   ) {

}
