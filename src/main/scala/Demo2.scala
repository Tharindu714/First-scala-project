object Demo2 {
  object Math {
    def add(x: Int = 45, y: Int = 15): Int = {
      return x + y;
    }
    def squre(x: Int) = x * x;
    def +(x: Int, y: Int): Int = {
      return x + y;
    }
    def **(x: Int) = x * x;
  }

  def main(args: Array[String]) {
    println(
      Math.add(60)
    ); // When do this this 60 parameter assign to the first parameter
    println(Math squre 9);

    var add = (x: Int, y: Int) => x + y;
    println(add(300, 50));

    val sum = 10 + 20;
    println(sum);

    println(Math.+(60, 15));
    println(Math ** 9);
  }
}
