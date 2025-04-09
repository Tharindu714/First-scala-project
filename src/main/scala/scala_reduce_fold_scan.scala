object scala_reduce_fold_scan {
  val list1 = List(1, 3, 5, 6, 9, 0, 2);
  val list2 = List("Max ", "is ", "very ", "good");

  def main(args: Array[String]) {
    println(list1.reduceLeft(_+_));
    println(list2.reduceLeft(_+_));
    println(list1.reduceLeft((x,y)=>{println(x + " , "+y); x+y;}));

    println(list1.reduceLeft(_-_));
    println(list1.reduceRight(_-_));
    println(list1.reduceRight((x,y)=>{println(x + " , "+y); x-y;}));

    println(list1.foldLeft(0)(_ + _)); // this value is same as reduceLeft()...
    //But thing is we pass the initial value 0 whic means 0 is added to the sum of values
    
    println(list1.foldLeft(100)(_ + _));
    println(list2.foldLeft("Z")(_ + _));

    println(list1.scanLeft(100)(_+_)); //scan method is giving the map of intermediate results
    println(list2.scanLeft("Scan ")(_+_));
  }
}
