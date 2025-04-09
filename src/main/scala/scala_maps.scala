object scala_maps {
  val myMap: Map[Int, String] =
    Map(801 -> "Max", 802 -> "Tom", 803 -> "Calvin", 806 -> "Misha");

  val myMap2: Map[Int, String] =
    Map(804 -> "Hardy", 805 -> "Julia", 807 -> "Dante");

  def main(args: Array[String]) {
    println(myMap);
    println(myMap(803))
    // println(myMap(805)) //Searching not included Int will give u errors

    println(myMap.keySet); // Defines as a set
    println(myMap.values);
    println(myMap.keys); // Defines as a set
    println(myMap.isEmpty);

    myMap.keys.foreach { key =>
      println("For this Key -> " + key + " Value is " + myMap(key));
    }
    println(myMap.contains(802))
    println(myMap ++ myMap2); //Concat 2 maps
    println(myMap.size); //size of the map
  }
}
