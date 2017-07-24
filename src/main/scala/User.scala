/**
  * Contains information known or derived about the human user of the device.
  * The user id is an exchange artifact and may be subject to rotation or other privacy policies .  However,
  * this user ID must be stable long enough to serve reasonably as the basis for frequency capping and re-targeting.
  *
  * @param id Exchange-specific ID for the user. At least one of id or buyeruid is recommended
  * @param buyeruid Buyer-specific ID for the user as mapped by the exchange for the buyer.
  *                 At least one of buyeruid or id is recommended.
  * @param yob Year of birth as a 4-digit integer
  * @param gender Gender, where “M” = male, “F” = female, “O” = known to be other
  * @param keywords Comma separated list of keywords, interests, or intent
  * @param customdate Optional feature to pass bidder data that was set in the exchange’s cookie.  The string must be
  *                   in base85 cookie safe characters and be in any format.  Proper JSON encoding must be used to
  *                   include “escaped” quotation marks.
  * @param geo Location of the user’s home base defined by a Geo object
  * @param data Additional user data.  Each Data object represents a different data source.
  * @param ext Placeholder for exchange-specific extensions to OpenRTB
  */
case class User(
               id:          Option[String] = None,
               buyeruid:    Option[String] = None,
               yob:         Option[Int] = None,
               gender:      Option[String] = None,
               keywords:    Option[String] = None,
               customdate:  Option[String] = None,
               geo:         Option[Geo] = None,
               data:        Option[List[Data]] = None,
               ext:         Option[Ext] = None
               )
{
}
