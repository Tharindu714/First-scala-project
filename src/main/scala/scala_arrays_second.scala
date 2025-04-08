import Array._
import scala.util.Random

object scala_arrays_second {
  val myArray = Array(20, 50, 10, 30)
  val myArray2 = Array.fill(5)(scala.util.Random.nextBoolean())
  val myArray3 = Array(1, 2, 3, 4, 5, 6, 8)

  def main(args: Array[String]) {
    // Fill myArray
    myArray(0) = 20
    myArray(1) = 50
    myArray(2) = 10
    myArray(3) = 30

    println("myArray3 length: " + myArray3.length)

    // Fill myArray2 with random true/false
    for (i <- myArray2.indices) {
      myArray2(i) = Random.nextBoolean()
    }

    println("Random Boolean Array:")
    for (x <- myArray2) {
      println(x)
    }

    println("Indexed Integer Array:")
    for (i <- 0 until myArray.length) {
      println(myArray(i))
    }
  }
}
