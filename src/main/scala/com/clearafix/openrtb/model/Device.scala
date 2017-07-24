package com.clearafix.openrtb.model

/**
  * Represents the device through which the user is interacting with a content and where
  * the ad will be displayed.
  *
  * @param ua             Browser user agent string
  * @param geo            Location of the device assumed to be the user’s current location defined by a Geo object
  * @param dnt            Standard “Do Not Track” flag as set in the header by the browser,
  *                       where 0 = tracking is unrestricted, 1 = do not track
  * @param lmt            “Limit Ad Tracking” signal commercially endorsed (e.g., iOS, Android),
  *                       where 0 = tracking is unrestricted, 1 = tracking must be limited per commercial guidelines
  * @param ip             IPv4 address closest to device
  * @param ipv6           IP address closest to device as IPv6
  * @param devicetype     The general type of device
  * @param make           Device make
  * @param model          Device model
  * @param os             Device operating system
  * @param osv            Device operating system version
  * @param hwv            Hardware version of the device
  * @param h              Physical height of the screen in pixels
  * @param w              Physical width of the screen in pixels
  * @param ppi            Screen size as pixels per linear inch
  * @param pxration       The ratio of physical pixels to device independent pixels
  * @param js             Support for JavaScript, where 0 = no, 1 = yes
  * @param geofetch       Indicates if the geolocation API will be available to JavaScript code running in the banner,
  *                       where 0 = no, 1 = yes
  * @param flashver       Version of Flash supported by the browser
  * @param language       Browser language using ISO-639-1-alpha-2
  * @param carrier        Carrier or ISP
  * @param connectiontype Network connection type
  * @param ifa            ID sanctioned for advertiser use in the clear
  * @param didsha1        Hardware device ID; hashed via SHA1
  * @param didmd5         Hardware device ID; hashed via MD5
  * @param dpidsha1       Platform device ID; hashed via SHA1
  * @param dpidmd5        Platform device ID; hashed via MD5
  * @param macsha1        MAC address of the device; hashed via SHA1
  * @param macmd5         MAC address of the device; hashed via MD5
  * @param ext            Placeholder for exchange-specific extensions to OpenRTB
  */
case class Device(
                   ua: Option[String] = None,
                   geo: Option[Geo] = None,
                   dnt: Option[Int] = None,
                   lmt: Option[Int] = None,
                   ip: Option[String] = None,
                   ipv6: Option[String] = None,
                   devicetype: Option[Int] = None,
                   make: Option[String] = None,
                   model: Option[String] = None,
                   os: Option[String] = None,
                   osv: Option[String] = None,
                   hwv: Option[String] = None,
                   h: Option[Int] = None,
                   w: Option[Int] = None,
                   ppi: Option[Int] = None,
                   pxration: Option[Float] = None,
                   js: Option[Int] = None,
                   geofetch: Option[Int] = None,
                   flashver: Option[Int] = None,
                   language: Option[String] = None,
                   carrier: Option[String] = None,
                   connectiontype: Option[Int] = None,
                   ifa: Option[String] = None,
                   didsha1: Option[String] = None,
                   didmd5: Option[String] = None,
                   dpidsha1: Option[String] = None,
                   dpidmd5: Option[String] = None,
                   macsha1: Option[String] = None,
                   macmd5: Option[String] = None,
                   ext: Option[Ext] = None
                 )