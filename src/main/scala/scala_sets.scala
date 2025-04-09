object scala_sets {
  val myset: Set[Int] = Set(1, 2, 5, 8, 9, 0, 67);
  val mutable_myset = scala.collection.mutable.Set(3, 4, 6, 7, 9, 19, 67);
  val names: Set[String] = Set("Max", "Tom", "John");

  def main(args: Array[String]) {
    println(myset); // Default is immutable
    println(myset + 10); // Default is immutable and I need to add 10 
    println(myset (5)); // In this Immutable set I need to check if 5 is included
    
    println(mutable_myset); // this set is mutable
    println(mutable_myset + 100); //if we add any value there.. it will not added to set
    println(mutable_myset.head);
    println(mutable_myset.tail);
    println(mutable_myset.isEmpty);

    println(myset++mutable_myset); //Shows all values ( If duplicate values in both sets it prevents) 

    println(myset.&(mutable_myset)); //get set intersect

    println(myset.++(mutable_myset));

    println(myset.intersect(mutable_myset)); //get set intersect

    println(myset.max);
    println(myset.min);
    
    println(names); 
    println(names("Tharindu")); //In this string set I need to check if the name Tharindu is included
    myset.foreach(println)
    for(name <- names){
        println(name);
    }
  }
}
