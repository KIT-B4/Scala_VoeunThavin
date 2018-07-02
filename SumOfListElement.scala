object SumOfListElement {
  def main(args: Array[String]): Unit = {
    var list = List(5, 8, 1, 10)
    var sum = 0
    list.foreach(a => sum+=a)
    println(sum)
  }
}
