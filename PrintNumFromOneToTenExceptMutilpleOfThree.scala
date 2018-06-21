object PrintNumFromOneToTenExceptMutilpleOfThree {
    def printNum() : Unit = {
        for(a <- 1 to 10) {
            if(a%3 !=0){
                println(a);
            }
        }
    }
    def main(args: Array[String]):Unit={
        printNum();
    }
}
