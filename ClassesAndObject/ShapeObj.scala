/*
Create abstract class Shape with abstract functions volume() and display(). 
Extend two classes Cube and Cylinder from it. Calculate volume of each and display it.
*/

import scala.io.StdIn.{readDouble}
import scala.math

trait Shape{
	def volume
	def display
}

class Cube extends Shape{
	var side : Double = 0.0
	var vol : Double = 0.0

	def this(side : Double){
		this()
		this.side = side
	}

	def volume{
		vol = this.side*this.side*this.side
	}

	def display{
		println("Volumn of cude is ",vol)
	}
}

class Cylinder extends Shape{
	
	var radius : Double = 0.0
	var height : Double = 0.0
	var vol : Double = 0.0

	def this(radius:Double,height:Double){
		this()
		this.radius = radius
		this.height = height
	}

	def volume{
		vol = math.Pi*this.radius*this.radius*this.height
	}

	def display{
		println("Volumn of Cylinder is ",vol)
	}
}

object ShapeObj{
	def main(args:Array[String]){
		println("Enter radius of cylinder")
		var radius : Double = readDouble()
		println("Enter height of cylinder")
		var height : Double = readDouble()

		val cylinder = new Cylinder(radius,height)
		cylinder.volume
		cylinder.display

		println("Enter lenght of cube")
		var length : Double = readDouble()

		val cube = new Cube(length)
		cube.volume
		cube.display
	}
}