object SumOfIntTuple {
  def main(args: Array[String]): Unit = {
    var t = List(1, "Falcon", 10, 4, "Noob")
    var sum=0
    //def sumInt(x:List) = x match {
    //  case _Int => sum=sum+x
    //  case _String =>
    //}
    t.foreach(e => e match {
      case e:Int => sum=sum+e
      case e:String =>
    })
    println(sum)
    t=t:+5
    t.foreach{println}
  }
}
