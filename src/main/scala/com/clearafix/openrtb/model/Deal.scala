package com.clearafix.openrtb.model

/**
  * Represents a specific deal that was struck a priori between a buyer and a seller.
  *
  * @param id a unique identifier for the direct dea
  * @param bidfloor Minimum bid for this impression expressed in CPM
  * @param bidfloorcur Currency specified using ISO-4217 alpha codes
  * @param at Optional override of the overall auction type of the bid request, where 1 = First Price ,
  *           2 = Second Price Plus, 3 = the value passed in bidfloor is the agreed upon deal price.
  *           Additional auction types can be defined by the exchange
  * @param wseat Whitelist of buyer seats allowed to bid on this deal.
  *              IDs of seats and knowledge of the buyer’s customers to which they refer must be
  *              coordinated between bidders and the exchange a priori
  * @param wadomain list of advertiser domains allowed to bid on this deal
  * @param ext Placeholder for exchange-specific extensions to OpenRTB
  */
case class Deal(
               id:          String = "",
               bidfloor:    Option[Float] = None,
               bidfloorcur: Option[String] = None,
               at:          Option[Int] = None,
               wseat:       Option[List[String]] = None,
               wadomain:    Option[List[String]] = None,
               ext:         Option[Ext] = None
               )

