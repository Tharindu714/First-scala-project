object Demo {

  object Math {
    def add(x: Int, y: Int): Int = {
      return x + y;
    }
    def squre(x: Int) = x * x;
  }

  def add(x: Int, y: Int): Int = {
    return x + y;
  }

  def substarct(x: Int, y: Int): Int = {
    x - y;
  }

  def multiply(x: Int, y: Int): Int = x * y;

  def divide(x: Int, y: Int) = x / y;

  def main(args: Array[String]) {
    println(Math.squre(9));
    println(Math.add(45, 15));
    println(Math squre 9); // syntactical suger

    println(add(45, 15));
    println(substarct(45, 15));
    println(multiply(45, 15));
    println(divide(45, 15));

  }

}
