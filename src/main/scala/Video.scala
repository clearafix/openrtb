/**
  * Representation of in-stream video impression. Video in OpenRTB generally assumes compliance with the VAST standard.
  * The presence of a Video as a subordinate of the Imp object indicates that this impression is offered as
  * a video type impression.
  *
  * @param mimes Content MIME types supported
  * @param minduration Minimum video ad duration in seconds
  * @param maxduration Maximum video ad duration in seconds
  * @param protocols Array of supported video protocols. At least one supported protocol must be specified
  * @deprecated protocol Deprecated in favor of protocols
  * @param w Width of the video player in pixels
  * @param h Height of the video player in pixels
  * @param startdelay Indicates the start delay in seconds for pre-roll, mid-roll, or post-roll ad placements
  * @param linearity Indicates if the impression must be linear, nonlinear, etc. If none specified,
  *                  assume all are allowed
  * @param skip Indicates if the player will allow the video to be skipped, where 0 = no, 1 = yes
  * @param skipmin Videos of total duration greater than this number of seconds can be skippable;
  *                only applicable if the ad is skippable
  * @param skipafter Number of seconds a video must play before skipping is enabled;
  *                  only applicable if the ad is skippable
  * @param sequence If multiple ad impressions are offered in the same bid request, the sequence number will allow
  *                 for the coordinated delivery of multiple creatives
  * @param battr Blocked creative attributes
  * @param maxextended Maximum extended ad duration if extension is allowed.
  *                    If blank or 0, extension is not allowed. If -1, extension is allowed, and there is no
  *                    time limit imposed. If greater than 0, then the value represents the number of seconds
  *                    of extended play supported beyond the maxduration value
  * @param minbitrate Minimum bit rate in Kbps
  * @param maxbitrate Maximum bit rate in Kbps
  * @param boxingallowed Indicates if letter-boxing of 4:3 content into a 16:9 window is allowed, where 0 = no, 1 = yes
  * @param playbackmethod Playback methods that may be in use. If none are specified, any method may be used.
  * @param delivery Supported delivery methods (e.g., streaming, progressive). If none specified,
  *                 assume all are supported
  * @param pos Ad position on screen.
  * @param companionad list of Banner objects if companion ads are available
  * @param api List of supported API frameworks for this impression
  * @param companiontype Supported VAST companion ad types. Recommended if companion Banner objects
  *                      are included via the companionad
  * @param ext Placeholder for exchange-specific extensions to OpenRTB
  */
case class Video(
                   mimes:           List[String] = List(),
                   minduration:     Option[Int] = None,
                   maxduration:     Option[Int] = None,
                   protocols:       Option[List[Int]] = None,
                   @deprecated protocol:        Option[Int] = None,
                   w:               Option[Int] = None,
                   h:               Option[Int] = None,
                   startdelay:      Option[Int] = None,
                   linearity:       Option[Int] = None,
                   skip:            Option[Int] = None,
                   skipmin:         Option[Int] = None,
                   skipafter:       Option[Int] = None,
                   sequence:        Option[Int] = None,
                   battr:           Option[List[Int]] = None,
                   maxextended:     Option[Int] = None,
                   minbitrate:      Option[Int] = None,
                   maxbitrate:      Option[Int] = None,
                   boxingallowed:   Option[Int] = None,
                   playbackmethod:  Option[List[Int]] = None,
                   delivery:        Option[List[Int]] = None,
                   pos:             Option[Int] = None,
                   companionad:     Option[List[Banner]] = None,
                   api:             Option[List[Int]] = None,
                   companiontype:   Option[List[Int]] = None,
                   ext:             Option[Ext] = None
                )
{

}

object Video {
  def withDefaults(): Video = Video(skipmin = Some(0), skipafter = Some(0), boxingallowed = Some(1))

}
