class Student(val name:String){
	var s_name:String = name

	def nameMethod(){
		println(s_name);
	}
}

class StudentX(override val name:String,val rollNo:Int) extends Student(name){
	var s_rollNo = rollNo;

	def rollNoMethod(){
		println(s_rollNo)
	}
}

object StudentXX{
	def main(args:Array[String]){
		val student = new StudentX("Aniket",20);

		student.rollNoMethod()
		student.nameMethod()
	}
}