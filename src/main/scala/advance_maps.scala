object `map_&_filters` {
  val list = List(1, 2, 4, 7, 0, 3, 5);
  val map = Map(1 -> "Tom", 2 -> "Max", 3 -> "John");

  def main(args: Array[String]) {
    println(list.map(_ * 2)); // This will mutiply list in 2x
    println(
      list.map(x => x + 3)
    ); // This will add 3 for every value in the list
    println(
      list.map(x => x / 0.5)
    ); // This will divide every values in 0.5 of the list
    println(
      list.map(x => "new String " + x)
    ); // add a String value to every value of the list
    println(
      list.map(x => "HI " * x)
    ); // this will multiply the "HI String from the value of specific value of the list"

    println(list.map(x => "Hello " + x));
    println(map.map(x => "Hello " + x));
    println(map.mapValues(x => "Hello " + x)); // This is deprecated in new versions
    println(map.view.mapValues(x => "Hello " + x).toMap)

    println("Hello".map(_.toUpper)); // Transform value into Uppercase
    println(List(List(1, 2, 3), List(3, 4, 5))); // get two Lists
    println(
      List(List(1, 2, 3), List(3, 4, 5)).flatten
    ); // get two lists into one List
    println(
      list.flatMap(x => List(x, x + 1))
    ); // Get the existing list and also get a new list with +1 added, it also flatten the map
  }
}
