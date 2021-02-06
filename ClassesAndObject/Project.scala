/*
Create class Project (id, name, location). Define parameterized constructor. 
Keep a count of each object created and display the details of each project.
*/

import scala.io.StdIn.{readLine,readInt}
import scala.util._

class Project(id:Int,name:String,location:String){

	def display{
		println("Id = "+id)
		println("Name = "+name)
		println("location = "+location)
	}
}

object Project{
	def main(args:Array[String]){
		var random = new Random
		var num = random.nextInt(10)
		var count : Int = 0

		while(count <= num){
			println("Enter id of project")
			var id = readInt()
			println("Enter name of project")
			var name = readLine()
			println("Enter location of project")
			var location = readLine()

			count += 1

			val project = new Project(id,name,location)
			println("----------------------------------")
			project.display
			println("----------------------------------")
		}

		println(count +" object created")
	}
}