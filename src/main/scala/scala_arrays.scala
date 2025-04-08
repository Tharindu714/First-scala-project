import Array._
object scala_arrays {
  val myArray: Array[Int] = new Array[Int](4);
  val myArray2 = new Array[Boolean](5);
  val myArray3 = Array(1, 2, 3, 4, 5, 6, 8);

  def main(args: Array[String]) {
    myArray(0) = 20;
    myArray(1) = 50;
    myArray(2) = 10;
    myArray(3) = 30;
    println(myArray); // u can get array object location

    println(myArray3.length);
    concat(myArray, myArray3);

    for (x <- myArray2) {
      println(x);
    }

    for (i <- 0 to (myArray.length - 1)) {
      println(myArray(i))
    }
  }
}
