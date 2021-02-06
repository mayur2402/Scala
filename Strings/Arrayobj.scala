/*
Create array of strings and read a string from user. Display all the elements of 
array containing given string
*/

import scala.io.StdIn.readLine;

object Arrayobj{
	def main(args:Array[String]){
		val fruits : Array[String] = Array("Mango","Apple","Pinapple","Grapes","Orange","Banana");

		for (fruit <- fruits) {
			print(fruit+"\t");
		}
		println()
		var str : String = readLine("Enter String\t");

		var pat = str.r;

		for (i <- fruits){
			var fruit = pat.findFirstIn(i);
			if(fruit != None){
				println(i);
			}
		}
	}
}