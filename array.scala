object array {
    def main(args: Array[String]): Unit = {
        var arr = new Array[Int](5)
        print("Input 5 numbers: ");
        for(i<-0 to arr.length-1)
            arr(i)=scala.io.StdIn.readInt()
        println("Output: ")
        arr.foreach(println)
        var sum = 0
        arr.foreach(a=>sum+=a)
        println("Sum = "+sum)
        var max=arr(0)
        for(i<-1 to arr.length-1)
            if(max<arr(i))
                max=arr(i)
        println("max = "+max)
    }
}