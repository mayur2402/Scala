import java.util._;
object Number{

	def toInteger(str:String):Option[Int] = {
		var num:Int = 0;
		try {
			num = Some(str.toInt);
		} catch {
			case e:NumberFormatException => None
		}
		
		return num;
	}

	def main(args:Array[String]){
		val sc = new Scanner(System.in);
		var num:Int = toInteger("200");
		println(num);

		println("Enter number");
		var str:String = sc.next();

		var num1:Int = toInteger(str);
		println(num1);
	}
}