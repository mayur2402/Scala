import scala.io.StdIn.readInt;

object BinaryOctal{

	def toBinary(num:Int){
		var n:Int = num;
		var binary:Array[Int] = new Array[Int](16);

		var i : Int = 0;
		while(n > 0){
			binary(i) = n % 2;
			i += 1;
			n = n / 2;
		}

		var len = i-1;

		println("Binary number ");
		while(len >= 0){
			printf("%d",binary(len))
			len -= 1;
		}
		println();
	}

	def toOctal(num:Int){
		var n:Int = num;
		var octal:Array[Int] = new Array[Int](16);
		var i : Int = 0;

		while(n > 0){
			octal(i) = n % 8;
			n = n / 8;
			i += 1;
		}

		var len : Int = i-1;
		println("octal number");
		while(len >= 0){
			printf("%d",octal(len));
			len -= 1;
		}
		println();
	}

	def main(args:Array[String]){
		try {
			println("Enter Number to convert into binary and octal");
			var num:Int = readInt();

			toBinary(num);
			toOctal(num);
		}
		catch {
			case e:Exception => {
				println("Error");
			}
		}
	}
	
}