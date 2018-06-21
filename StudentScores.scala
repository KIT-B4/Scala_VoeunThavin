class Student(ss:Int, jj:Int, xx:Int, yy:Int) {
	var (s:Int, j:Int, x:Int, y:Int) = (ss, jj, xx, yy)
}
object StudentScores {
	def main(args: Array[String]): Unit = {
		val stu1 = new Student(5, 6, 20, 35)
		val stu2 = new Student(10, 6, 15, 44)
		if(stu1.s>stu2.s || stu1.s<stu2.s)
			print("1 ")

		if(stu1.j>stu2.j || stu1.j<stu2.j)
			print("1 ")

		if(stu1.x>stu2.x || stu1.x<stu2.x)
			print("1 ")

		if(stu1.y>stu2.y || stu1.y<stu2.y)
			print("1 ")
	}
}