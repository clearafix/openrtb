import com.fasterxml.jackson.databind.annotation.JsonDeserialize

/**
  * Encapsulates various methods for specifying a geographic location.
  *
  * @param lat Latitude from 90.0 to +90.0, where negative is south
  * @param lon Longitude from 180.0 to +180.0, where negative is wes
  * @param typeSource Source of location data; recommended when passing lat/lon
  * @param accuracy Estimated location accuracy in meters; recommended when lat/lon are specified and derived
  *                 from a device’s location services (i.e., type = 1).  Note that this is the accuracy as reported
  *                 from the device.  Consult OS specific documentation (e.g., Android, iOS) for exact interpretation.
  * @param lastfix Number of seconds since this geolocation fix was established. Note that devices may cache location
  *                data across multiple fetches.  Ideally, this value should be from the time the actual fix was taken
  * @param ipservice Service or provider used to determine geolocation from IP address if applicable (i.e., type = 2)
  * @param country Country code using ISO 3166-1-alpha-3
  * @param region Region code using ISO-3166-2; 2-letter state code if USA
  * @param regionfips104 Region of a country using FIPS 10-4 notation
  * @param metro Google metro code; similar to but not exactly Nielsen DMAs
  * @param city City using United Nations Code for Trade&Transport Locations
  * @param zip Zip or postal code
  * @param utcoffset Local time as the number +/- of minutes from UTC
  * @param ext Placeholder for exchange-specific extensions to OpenRTB
  */
case class Geo(
                lat:            Option[Double] = None,
                lon:            Option[Double] = None,
                typeSource:     Option[Int] = None,
                accuracy:       Option[Int] = None,
                lastfix:        Option[Int] = None,
                ipservice:      Option[Int] = None,
                country:        Option[String] = None,
                region:         Option[String] = None,
                regionfips104:  Option[String] = None,
                metro:          Option[String] = None,
                city:           Option[String] = None,
                zip:            Option[String] = None,
                utcoffset:      Option[Int] = None,
                ext:            Option[Ext] = None
              )
{
}
