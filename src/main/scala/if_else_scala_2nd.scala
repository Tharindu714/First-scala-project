object if_else_scala_2nd {
  def main(args: Array[String]) {
    val x = 20;
    val y = 30;
    var res = "";
    if (x < 20 && y == 30) {
      res = s"Matching x is equal to $x & y is equal to $y";
    } else {
      res = s"Not Matching because x is equal to $x & y is equal to $y";
    }

    if (x < 20 || y == 30) {
      res = s"Matching x is equal to $x & y is equal to $y";
    } else {
      res = s"Not Matching because x is equal to $x & y is equal to $y";
    }

    if (x < 20 || y > 30) {
      res = s"Matching x is equal to $x & y is equal to $y";
    } else {
      res = s"Not Matching because x is equal to $x & y is equal to $y";
    }

    if (x == 20 || y == 30) {
      res = s"Matching x is equal to $x & y is equal to $y";
    } else {
      res = s"Not Matching because x is equal to $x & y is equal to $y";
    }
    println(res);
  }
}
