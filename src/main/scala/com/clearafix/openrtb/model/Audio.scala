package com.clearafix.openrtb.model

/**
  * Representation of audio ad impression type. The presence of a Audio as a subordinate of the Imp object
  * indicates that this impression is offered as an audio type impression.
  *
  * @param mimes Content MIME types supported
  * @param minduration Minimum audio ad duration in seconds
  * @param maxduration Maximum audio ad duration in seconds
  * @param protocols Array of supported audio protocols
  * @param startdelay Indicates the start delay in seconds for pre-roll, mid-roll, or post-roll ad placements
  * @param sequence If multiple ad impressions are offered in the same bid request,
  *                 the sequence number will allow for the coordinated delivery of multiple creatives
  * @param battr Blocked creative attributes
  * @param maxextended Maximum extended ad duration if extension is allowed. If blank or 0, extension is not allowed.
  *                    If -1, extension is allowed, and there is no time limit imposed.
  *                    If greater than 0, then the value represents the number of seconds of extended play
  *                    supported beyond the maxduration value
  * @param minbitrate Minimum bit rate in Kbps
  * @param maxbitrate Maximum bit rate in Kbps
  * @param delivery Supported delivery methods (e.g., streaming, progressive). If none specified,
  *                 assume all are supported
  * @param companionad list of Banner objects if companion ads are available
  * @param api List of supported API frameworks for this impression
  * @param companiontype Supported DAAST companion ad types. Recommended if companion Banner objects are included
  *                      via the companionad list
  * @param maxseq The maximum number of ads that can be played in an ad pod
  * @param feed Type of audio feed
  * @param stitched Indicates if the audio is stitched, where 0 = no, 1 = yes
  * @param nvol Volume normalization mode
  * @param dl Indicates if the audio file can be downloaded by the user, where 0 = no, 1 = yes
  * @param ext Placeholder for exchange-specific extensions to OpenRTB
  */
case class Audio(
                mimes:          List[String] = List(),
                minduration:    Option[Int] = None,
                maxduration:    Option[Int] = None,
                protocols:      Option[List[Int]] = None,
                startdelay:     Option[Int] = None,
                sequence:       Option[Int] = None,
                battr:          Option[List[Int]] = None,
                maxextended:    Option[Int] = None,
                minbitrate:     Option[Int] = None,
                maxbitrate:     Option[Int] = None,
                delivery:       Option[List[Int]] = None,
                companionad:    Option[List[Banner]] = None,
                api:            Option[List[Int]] = None,
                companiontype:  Option[List[Int]] = None,
                maxseq:         Option[Int] = None,
                feed:           Option[Int] = None,
                stitched:       Option[Int] = None,
                nvol:           Option[Int] = None,
                dl:             Option[Int] = None,
                ext:            Option[Ext] = None
                )
