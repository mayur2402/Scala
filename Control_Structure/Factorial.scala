import scala.io.StdIn.readInt;

object Factorial{

	def factorial(no:Int):Int ={
		var n = no;
		var fact:Int = 1;
		if(n < 0){
			return -1;
		}
		else{
			while(n != 1){
				fact = fact*n;
				n -= 1;
			}
		}
		return fact;
	}

	def main(args:Array[String]){
		try {
			println("Enter number to find factorial");
			var no:Int = readInt();

			var fact:Int = factorial(no);

			if(fact == -1){
				println("Error invalid number");
			}
			else{
				println("Factorial of "+no+" is "+fact);
			}
		} 
		catch {
			case e: Exception => {
				println("Please enter valid input");
			}
		}

	}
}
