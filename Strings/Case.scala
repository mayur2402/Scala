/*
Write a program to count uppercase letters in a string and convert it to lowercase and display
the new string.
*/

import scala.io.StdIn.readLine

object Case{
	def main(args:Array[String]){
		try {
			println("Enter String");
			var str:String = readLine();

			var count:Int = 0;
			for (x <- str){
				if(x >= 'A' && x <= 'Z'){
					count += 1;
				}
			}

			println("String in lowercase "+str.toLowerCase);
			println("uppercase letters "+count);
		} 
		catch {
			case e:Exception =>{
				println(e);
			}
		}
	}
}