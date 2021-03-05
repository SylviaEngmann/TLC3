package ScalaOO

class Transaction(ID:String,symbol:String,quantity:Int, initialPrice:Double)
  extends EquityTrade (ID,symbol, quantity, initialPrice) with FeePayable with Taxable {
  def amount :Double = {
    val trade = new EquityTrade(ID,symbol,quantity,initialPrice)
    val tradeValue = trade.value()
    val preTax = tradeValue + fee
    val taxOnValue = preTax * tax

    tradeValue + fee + taxOnValue
  }
}
