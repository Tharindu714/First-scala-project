object if_else_scala {
  def main(args: Array[String]) {
    val x = 40;
    var res = "";
    if (x == 20) {
      println("This matches");
      res = "This response Matches"
    } else {
      println("Not Matching");
      res = s"This response is not matching because x is equal to $x"
    }
    println(res)

    val res2 = if (x == 20) "X is equal to 20" else s"x is equal to $x";
    println(res2);

  }
}
