object for_loop {
  def main(args: Array[String]) {
    for (i <- 1 to 5) {
      println("i using to " + i);
    }

    println("Next Example of For Loop");

    for (i <- 1.to(5)) {
      println("i using to " + i);
    }

    println("Next Example of For Loop");
    for (i <- 1.until(6)) {
      println("I using until " + i);
    }

    println("Next Example of For Loop");

    for (i <- 1 until 6) {
      println("I using until " + i);
    }
    println("Next Example of For Loop");

    for (i <- 1 to 9; j <- 1 to 3) { // multiple Ranges
      println("i using multiple ranges " + i + " " + j);
    }

    val list = List(1, 2, 3, 5, 4, 6, 78, 9, 6, 8)
    for (i <- list) {
      println("i using list " + i);
    }

    println("Next Example of For Loop");

    val list2 = List(1, 2, 3, 5, 4, 6, 78, 9, 6, 8)
    for (i <- list2; if i < 6) {
      println("i using Filters " + i);
    }

    val list3 = List(1, 2, 3, 5, 4, 6, 78, 9, 6, 8)
   val result = for {
      i <- list3
      if i < 6
    } yield  {
      i * i
    }
    println("result =" + result);

  }
}
