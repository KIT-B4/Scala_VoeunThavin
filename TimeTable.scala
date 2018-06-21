object TimeTable {
    def main(args: Array[String]):Unit= {
        print("Enter a number to display Timetable: ");
        var input = scala.io.StdIn.readInt();
        for(num <- 1 to 10) {
            println(input + "*" + num + "=" + (input*num));
        }
    }
}
