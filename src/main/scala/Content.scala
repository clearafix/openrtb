/**
  * Describes the content in which the impression will appear.
  *
  * @param id ID uniquely identifying the content
  * @param episode Episode number
  * @param title Content title
  * @param series Content series
  * @param season Content season
  * @param artist Artist credited with the content
  * @param genre Genre that best describes the content
  * @param album Album to which the content belongs; typically for audio
  * @param isrc International Standard Recording Code conforming to ISO-3901
  * @param producer Details about the content Producer
  * @param url URL of the content, for buy-side contextualization or review
  * @param cat list of IAB content categories that describe the content producer
  * @param prodq Production quality
  * @deprecated videoquality Deprecated in favor of prodq
  * @param context Type of content (game, video, text, etc.)
  * @param contentrating Content rating
  * @param userrating User rating of the content
  * @param qagmediarating Media rating per IQG guidelines
  * @param keywords Comma separated list of keywords describing the content
  * @param livestream 0 = not live, 1 = content is live
  * @param sourcerelationship 0 = indirect, 1 = direct
  * @param len Length of content in seconds; appropriate for video or audio
  * @param language Content language using ISO-639-1-alpha-2
  * @param embeddable Indicator of whether or not the content is embeddable (e.g., an embeddable video player),
  *                   where 0 = no, 1 = yes
  * @param data Additional content data
  * @param ext Placeholder for exchange-specific extensions to OpenRTB
  */
case class Content(
                  id:                   Option[String] = None,
                  episode:              Option[Int] = None,
                  title:                Option[String] = None,
                  series:               Option[String] = None,
                  season:               Option[String] = None,
                  artist:               Option[String] = None,
                  genre:                Option[String] = None,
                  album:                Option[String] = None,
                  isrc:                 Option[String] = None,
                  producer:             Option[Producer] = None,
                  url:                  Option[String] = None,
                  cat:                  Option[List[String]] = None,
                  prodq:                Option[Int] = None,
                  @deprecated videoquality:         Option[Int] = None,
                  context:              Option[Int] = None,
                  contentrating:        Option[String] = None,
                  userrating:           Option[String] = None,
                  qagmediarating:       Option[Int] = None,
                  keywords:             Option[String] = None,
                  livestream:           Option[Int] = None,
                  sourcerelationship:   Option[Int] = None,
                  len:                  Option[Int] = None,
                  language:             Option[String] = None,
                  embeddable:           Option[Int] = None,
                  data:                 Option[List[Data]] = None,
                  ext:                  Option[Ext] = None
                  )
{

}
