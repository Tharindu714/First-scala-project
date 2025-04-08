error id: local1
file:///E:/Scala/Scala-tutorials/src/main/scala/String_interpolation-first.scala
empty definition using pc, found symbol in pc: 
found definition using semanticdb; symbol local1
empty definition using fallback
non-local guesses:

offset: 383
uri: file:///E:/Scala/Scala-tutorials/src/main/scala/String_interpolation-first.scala
text:
```scala
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

    println(raw"$name%s is $age%d@@ years old & $height%f feet")

  }

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 