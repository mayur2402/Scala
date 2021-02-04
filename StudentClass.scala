case class Student(name:String,rollNo:Int){
	def display(){
		println(name+"\t"+rollNo);
	}
}

object StudentClass{
	def main(args:Array[String]){
		var student = new Student("sagar",27);
		student.display();
	}
}