```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Correct usage of map with a List of Ints
  val doubledList = list.map(_ * 2)

  println(doubledList) // Output: List(2, 4, 6, 8, 10)
}
```