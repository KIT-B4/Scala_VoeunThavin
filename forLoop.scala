object forLoop {
  def main(args: Array[String]): Unit = {
    print("Input num: ")
    var num:Int = scala.io.StdIn.readInt()
    for(i<-0 to num) 
      if (i%4!=0)
        print(i+" ")
  }
}

