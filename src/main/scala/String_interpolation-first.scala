object `String_interpolation-first` {
  def main(args: Array[String]) {
    val name = "Tharindu"
    val age = 24
    val height = 5.7

    println(name + " is " + age + " years old.")
    println(s"$name is $age years old")
    println(f"$name%s is $age%d years old & $height%f feet")

    println(s"Hello \nWorld")
    println(raw"Hello \nWorld")

    println(raw"$name%s is $age%d years old & $height%f feet")
    println(raw"$name is $age years old & $height feet")
  }
}
