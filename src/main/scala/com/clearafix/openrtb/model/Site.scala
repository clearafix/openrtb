package com.clearafix.openrtb.model

/**
  * Represent a website. Used if ad supports website as a content. Must not be used in the request with
  * App object.
  *
  * @param id Exchange-specific site ID
  * @param name of the site
  * @param domain of the site
  * @param cat  list of IAB content categories of the site
  * @param sectioncat list of IAB content categories that describe the current section of the site
  * @param pagecat list of IAB content categories that describe the current page or view of the site
  * @param page URL of the page where the impression will be shown
  * @param ref Referrer URL that caused navigation to the current page
  * @param search Search string that caused navigation to the current page
  * @param mobile Indicates if the site has been programmed to optimize layout when viewed on mobile devices,
  *               where 0 = no, 1 = yes
  * @param privacypolicy Indicates if the site has a privacy policy, where 0 = no, 1 = yes
  * @param publisher Details about the Publisher of the site
  * @param content Details about the Content of the site
  * @param keywords Comma separated list of keywords about the site
  * @param ext Placeholder for exchange-specific extensions to OpenRTB
  */
case class Site(
               id:              Option[String] = None,
               name:            Option[String] = None,
               domain:          Option[String] = None,
               cat:             Option[List[String]] = None,
               sectioncat:      Option[List[String]] = None,
               pagecat:         Option[List[String]] = None,
               page:            Option[String] = None,
               ref:             Option[String] = None,
               search:          Option[String] = None,
               mobile:          Option[Int] = None,
               privacypolicy:   Option[Int] = None,
               publisher:       Option[Publisher] = None,
               content:         Option[Content] = None,
               keywords:        Option[String] = None,
               ext:             Option[Ext] = None
               )
{

}
