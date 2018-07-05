object Arrays {
    def main(args: Array[String]): Unit = {
        var myArrays = Range(1, 20)
        for(i<-myArrays) {
            if(i%3==0 && i!=15)
                println("Foo")
            else if(i%5==0)
                println("Bar")
            else if(i==15)
                println("FooBar")
        }
    }
}