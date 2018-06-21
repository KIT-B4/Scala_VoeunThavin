object hbd {
  def main(args: Array[String]): Unit = {
    print("Input number: ")
    var a:Int=scala.io.StdIn.readInt()
    println()
    while(a>=0) {
      print(a+" ")
      if(a==0)
        println("Happy Birthday")
      a-=1
    }
  }
}

