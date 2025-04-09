object scala_option {
  val list = List(1, 2, 4);
  val map = Map(1 -> "Tom", 2 -> "Max", 3 -> "John");
  val option : Option[Int] = None;
  val option2 : Option[Int] = Some(55);

  def main (args:Array[String]){
    println(list.find(_>2));
    println(list.find(_>2).get); // without getOrElse() method this will show errors if not contains value comes
    println(list.find(_>7).getOrElse(0));

    println(map.get(2));
    println(map.get(2).get);
    println(map.get(7).getOrElse("Not Found"));

    println(option.isEmpty);
    println(option.isDefined);

    println(option2.isDefined);
    println(option2.isEmpty);
    println(option2.get);

  }
}
