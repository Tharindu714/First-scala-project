object closures {
  var number = 10;
  val add = (x: Int) => x + number;
  val substract = (x: Int) => {
    number = x -number;
    number;
}
val mulitiply = (x: Int) => {
    x *number;
}

  def main(args: Array[String]) {
    //number = 100;  //reassign the variable number
    println(add(20));
    println(substract(30));
    println(mulitiply(45));
    println (number);
  }
}
