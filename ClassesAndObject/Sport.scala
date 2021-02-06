/*
Define a class Sports (id, name, description, amount). Derive two classes Indoor and Outdoor.
Define appropriate constructors and operations. Create an object and perform operations.
*/

import scala.io.StdIn.{readInt,readLine(),readFloat}
class Sport(id:Int,name:String,description:String,amount:Float){

	def accept()
}

class Indoor(id:Int,name:String,description:String,amount:Float) extends Sport(id,name,description,amount){

}

class Outdoor(id:Int,name:String,description:String,amount:Float) extends Sport(id,name,description,amount){

}

object Sport{
	def main(args:String){
		
		var type : Int = 0;

		println("1.Indoor\n2.Outdoor\nEnter your choice\n")
		type = readInt()

	}
}