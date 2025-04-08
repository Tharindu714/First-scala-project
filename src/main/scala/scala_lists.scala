object scala_lists {
  val myList: List[Int] = List(1, 3, 5, 7, 9);
  val names: List[String] = List("Max", "Tom", "John", "Hardy");

  def main(args: Array[String]) {
    println(0 :: myList);
    println(myList);
    println(names);

    println(1 :: 5 :: 9 :: Nil);
    println(myList.head);
    println(names.tail);

    println(names.isEmpty);
    println(myList.reverse);

    println(List.fill(5)(2));
    println(myList.max);
    myList.foreach(println)

    var sum: Int = 0;
    myList.foreach(sum += _);
    println(sum);

    for (name <- names) {
      println(name);
    }
    println(names(0));
  }
}
