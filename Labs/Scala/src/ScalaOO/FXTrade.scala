package ScalaOO

class FXTrade(ID: String, initialPrice: Double) extends Trade(ID,initialPrice){
  override def value() : Double = initialPrice

  override def isExecutable(): Boolean = false

  override def toString: String = s"Equity Trade: $ID,$initialPrice"

}
