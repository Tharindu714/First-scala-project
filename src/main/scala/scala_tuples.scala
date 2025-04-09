object scala_tuples {
  val myTuples = (1, 2, "hello", true);
  val myTuples2 = new Tuple2("hello", true); // until Tuple22 only
  val myTuples3 = new Tuple3(1, "hello", ("Tom", 22)); 

  def main(args: Array[String]) {
    println(myTuples._3); // get the third value
    println(myTuples._2); // get the first value

    // println(myTuples2._4); //value _4 is not a member... compile error

    myTuples.productIterator.foreach { i =>
      println(i);
    }
    println(1 -> "Tom" -> true);
    println(myTuples3._3._2);
  }
}
