package ScalaOO

abstract class Trade (ID: String, initialPrice: Double)
{
//  private var _price = initialPrice
//  def price = _price
//  def price_ (priceValue: Double) = {
//    if (priceValue >= 0 ) _price = priceValue
//  }
  override def toString = s" The trade ID is $ID, " +
    s"and price: $initialPrice"


def value():Double
//  value(3.5, 3)

  //abstract method
  def isExecutable(): Boolean


}

//Object
//object Trade {
//  def apply(id: String, symbol: String, quantity: Int, price: Double) = new Trade (id, symbol, quantity, price);
//}

//Case class
//case class Trade (id: String, symbol: String, quantity: Int, initialPrice: Double)
