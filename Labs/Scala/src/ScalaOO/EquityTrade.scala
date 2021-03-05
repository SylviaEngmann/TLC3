package ScalaOO

class EquityTrade (ID: String,symbol: String, quantity:Int, initialPrice: Double) extends Trade (ID,initialPrice){

  override def value() : Double = quantity * initialPrice

  override def isExecutable(): Boolean = true

  override def toString: String = s"Equity Trade: $ID,$symbol,$quantity,$initialPrice"
}
