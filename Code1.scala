object Demo {
    def printNum() : Unit = {
        var a=0;
        for(a <- 1 to 10) {
            if(a%3 !=0){
                println(a);
            }
        }
    }
    def main(args: Array[String]) {
        printNum();
    }
}