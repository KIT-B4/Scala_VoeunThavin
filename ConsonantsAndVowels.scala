object ConsonantsAndVowels {
  def main(args: Array[String]): Unit = {
    val input: String = scala.io.StdIn.readLine()
    val output = new Array[Char](50)
    var count: Int = 0
    var j:Int=0
    for(i <- 0 until input.length) {
      if(input(i)=='a' || input(i)=='A' ||
        input(i)=='e' || input(i)=='E' ||
        input(i)=='i' || input(i)=='I' ||
        input(i)=='o' || input(i)=='O' ||
        input(i)=='u' || input(i)=='U') {
        count+=1
      } else {
        output(j) = input(i)
        j+=1
      }
    }
    print("Consonant: ");
    for(ch <- output) {
      print(ch)
      print(" ")
    }
    println("\nNumber of Vowels: "+count)
  }
}
