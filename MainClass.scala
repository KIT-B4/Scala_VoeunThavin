object MainClass {
  def main(args: Array[String]): Unit = {
    var (a:Int, b:Int, c:Int) = (0, 0, 0)
    var x:Int=0
    print("Input a: ")
    a = scala.io.StdIn.readInt()
    print("Input b: ")
    b = scala.io.StdIn.readInt()
    print("Input c: ")
    c = scala.io.StdIn.readInt()
    if(a<b) {
      x=b
      b=a
      a=x
    }
    if(a<c) {
      x=c
      c=a
      a=x
    } 
    if(b<c) {
      x=c
      c=b
      b=x   
    }
    print("a=" + a)
    print(" b=" + b)
    print(" c=" + c)
  }
}
