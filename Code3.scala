object demo {
    def printFooBar(): Unit = {
        var a = 0;
        for(a <- 1 to 100) {
            if(a%3==1) {
                println("Foo");
            }
            if(a%5==1) {
                println("Bar");
            }
            if(a%15==1) {
                println("FooBar");
            }
        }
    }
    def main(args: Array[String]) {
        printFooBar();
    }
}