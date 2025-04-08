object currying {
  def add(x: Int, y: Int) = x + y

  def add2(x: Int) = (y: Int) => x + y;

  def add3(x: Int)(y: Int) = x + y;

  def main(args: Array[String]) {
    println(add(20, 10));
    println(add2(20)(30));

    val sum40 = add2(40);
    // println(sum40(50)(200))  // Wrong! sum40(50) = 90 → now you try to call (90)(200)? 🤯
    println(sum40(100));

    val sum50 = add3(50) _;
    println(sum50(400));
  }
}