/*
Write a program to read two strings. Remove the occurrence of second string in first string.
*/
import scala.io.StdIn.readLine;

object Remove{

	def main(args:Array[String]){

		try {
			println("Enter String");
			var str = readLine();
			println("Enter String To remove from above string");
			var rem = readLine();

			var pat = rem.r;

			var s = pat.replaceAllIn(str," ").trim;

			println(s"String After removing $rem is $s");
		}
		catch {
			case e:Exception => {
				println(e);
			}
		}
	}
}