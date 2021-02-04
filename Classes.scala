class Student(roll:Int, name:String){
	println(roll,name)
}

class StudentX(){
	def display(roll : Int,name : String){
		println(roll,name)
	}
}

class StudentXX{
	def display(roll : Int,name : String){
		println(roll,name)
	}
}

class StudentXXX{
	var roll : Int = 0
	var name : String = null;
	def display{
		println(roll,name)
	}
}

object Classes{

	def main(args:Array[String]){
		var student = new Student(20,"Mayur")

		var studntx = new StudentX()
		studntx.display(30,"Devarshi")

		var studntxx = new StudentXX
		studntxx.display(40,"Sagar")
		
		var studntxxx = new StudentXXX
		studntxxx.roll = 19
		studntxxx.name = "Aniket"
		studntxxx.display
	}
}