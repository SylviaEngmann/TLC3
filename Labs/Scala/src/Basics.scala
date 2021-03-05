import java.text.{SimpleDateFormat}

object Basics extends App{
  def conversion (c : Double): Unit = {
    println(c + " degrees celsius is " + ((c * 9 / 5) + 32) + " fahrenheit")
  }

  conversion(30)

  def stringToDate (dateString : String) : Unit = {
    val oldDateFormat = new SimpleDateFormat("dd/mm/yy")
    val newDate = oldDateFormat.parse(dateString).toString
    println(newDate)

  }
  stringToDate("01/12/21")
}
