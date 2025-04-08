import java.util.Date
object date {
  var number = 10
  val add = (x: Int) => x + number

  def main(args: Array[String]) {
    val now = new Date()
    println("Current Date: " + now)
    println("Add result: " + add(20))
  }
}

