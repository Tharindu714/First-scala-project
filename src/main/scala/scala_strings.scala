object scala_strings {
  val num1 = 75;
  val num2 = 100.25;
  val str1: String = "Hello World";
  val str2: String = " Scala!";

  def main(args: Array[String]) {
    println(str1.concat(str2)+" (with concatination)");
    println("The String Length is "+str1.length());
    println(str1 + str2 +" (without concat() method)");

    printf("(%d -- %f -- %s)", num1, num2, str1);
    val result = printf("(%d -- %f -- %s)", num1, num2, str1);
    println(result);
    println("(%d -- %f -- %s)".format(num1, num2, str1));
  }
}
