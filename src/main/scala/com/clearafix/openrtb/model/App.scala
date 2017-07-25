package com.clearafix.openrtb.model

/**
  * Represents a non-browser application content supported by ad (typically mobile app).
  *
  * @param id            Exchange-specific app ID
  * @param name          of the app
  * @param bundle        A platform-specific application identifier intended to be unique to the app and independent of the exchange. On Android, this should be a bundle or package name (e.g., com.foo.mygame). On iOS, it is a numeric ID
  * @param domain        of the app
  * @param storeurl      App store URL for an installed app
  * @param cat           list of IAB content categories of the app
  * @param sectioncat    list of IAB content categories that describe the current section of the app
  * @param pagecat       list of IAB content categories that describe the current page or view of the app
  * @param ver           version of the app
  * @param privacypolicy Indicates if the app has a privacy policy, where 0 = no, 1 = yes
  * @param paid          0 = app is free, 1 = the app is a paid version
  * @param publisher     Details about the {@link com.clearafix.openrtb.model.Publisher Publisher} of the app
  * @param content       Details about the {@link com.clearafix.openrtb.model.Content Content} of the app
  * @param keywords      Comma separated list of keywords about the app
  * @param ext           Placeholder for exchange-specific extensions to OpenRTB
  */
case class App(
                id: Option[String] = None,
                name: Option[String] = None,
                bundle: Option[String] = None,
                domain: Option[String] = None,
                storeurl: Option[String] = None,
                cat: Option[Seq[String]] = None,
                sectioncat: Option[Seq[String]] = None,
                pagecat: Option[Seq[String]] = None,
                ver: Option[String] = None,
                privacypolicy: Option[Int] = None,
                paid: Option[Int] = None,
                publisher: Option[Publisher] = None,
                content: Option[Content] = None,
                keywords: Option[String] = None,
                ext: Ext = None
              )