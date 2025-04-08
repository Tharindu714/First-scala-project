object higher_order_func {
  def math(x: Double, y: Double, f: (Double, Double) => Double): Double =
    f(x, y);

  def math(
      x: Double,
      y: Double,
      z: Double,
      f: (Double, Double) => Double
  ): Double = f(f(x, y), z);

  def main(args: Array[String]) {
    val result_sum = math(51.67, 60.45, (x, y) => x + y); // sum
    println(result_sum);


    val result_min = math(25.89, 20.90, (x, y) => x min y); // min
    println(result_min);


    val result_max = math(50, 20, (x, y) => x max y); // max
    println(result_max);

    val result_multiply =
      math(50.001, 20.98, 10.8, (x, y) => x * y); // multiply
    println(result_multiply);


    val result_def_multiply = math(50, 20, 10, _ + _); // sum
    println(result_def_multiply);


    val result_de_min = math(50, 20, 10, _ min _); // sum
    println(result_de_min);

    val sum = (a: Int, b: Int, c: Int) => a + b + c
    val f = sum(10, 20, _: Int)
    println(f(30));


    val h = sum(10, _: Int, _: Int)
    println(h(30, 100));

  }
}
