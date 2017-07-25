package com.clearafix.openrtb.model

/**
  *
  * @param `type`
  * @param value
  * @param vendor
  * @param ext
  */
case class Metric(
                 `type`: String,
                 value: Double,
                 vendor: Option[String],
                 ext: Ext
                 )
{
  require(!`type`.isEmpty && value >= 0 && value <= 1)
}