class Student(var id: Int, var name: String, var age: Int, var grade: Int) {
   override def toString: String = s"($id, $name, $age, $grade)"
}
object Student {
  def main(args: Array[String]): Unit = {
    def stu1 = new Student(1, "Falcon", 18, 1);
    println(stu1);
  }
}
