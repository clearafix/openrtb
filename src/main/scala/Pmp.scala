/**
  *  Private marketplace container for direct deals between buyers and sellers that may pertain to this impression.
  *
  * @param private_auction Indicator of auction eligibility to seats named in the Direct Deals object,
  *                        where 0 = all bids are accepted,
  *                        1 = bids are restricted to the deals specified and the terms thereof
  * @param deals Array of Deal objects that convey the specific deals applicable to this impression
  * @param ext Placeholder for exchange-specific extensions to OpenRTB
  */
case class Pmp(
              private_auction:  Option[Int] = None,
              deals:            Option[List[Deal]] = None,
              ext:              Option[Ext] = None
              )
{
}
