package com.clearafix.openrtb.model

/**
  *
  * @param fd
  * @param tid
  * @param pchain
  * @param ext
  */
case class Source(
                 fd: Option[Int] = None,
                 tid: Option[String] = None,
                 pchain: Option[String] = None,
                 ext: Ext = None
                 )