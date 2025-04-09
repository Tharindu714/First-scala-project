object scala_filters {
  val list = List(1, 2, 4, 7, 0, 3, 5);
  val map = Map(1 -> "Tom", 2 -> "Max", 3 -> "John");

  def main(args: Array[String]) {
    println(list.filter(x => x % 2 == 0)); // even numbers
    println(list.filter(x => x % 2 != 0)); // odd numbers

// ✅ 1. Filter numbers greater than a specific value
    println(list.filter(_ > 3)) // numbers greater than 3

// ✅ 2. Filter zero and non-zero elements
    println(list.filter(_ == 0)) // only zeros
    println(list.filter(_ != 0)) // non-zero elements

// ✅ 3. Filter names from map with specific conditions
    println(map.filter { case (k, v) =>
      v.startsWith("J")
    }) // names starting with J

// ✅ 4. Filter keys from the map
    println(map.filterKeys(_ > 1)) // keys greater than 1 -> This is deprecated in new versions
    println(map.view.filterKeys(_ > 1).toMap) // keys greater than 1

//✅ 5. Combine filters (chaining conditions)
    println(
      list.filter(x => x > 2 && x % 2 == 0)
    ) // even numbers greater than 2

//✅ 6. Use ``partition`` to split based on a condition
    val (evens, odds) = list.partition(_ % 2 == 0)
    println("Evens: " + evens)
    println("Odds: " + odds)

// ✅ 7. Get values from ``map`` with keys present in ``list``
    val filteredNames = list.flatMap(map.get)
    println(filteredNames)

//✅ 8. Use ``collect`` to filter and transform at once
    println(list.collect { case x if x % 2 == 0 => s"Even: $x" })

//✅ 9. Filter based on index (e.g., elements at even indices)
    println(
      list.zipWithIndex.filter { case (_, idx) => idx % 2 == 0 }.map(_._1)
    )

  }
}
