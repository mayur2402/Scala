import scala.io.StdIn.readInt;

object Average{

	def average(start:Int,end:Int):Float = {
		var start1:Int = start;
		var end1:Int = end;

		if(start1 > end1){
			println("Invalid input");
			System.exit(-1);
		}

		var sum:Int = 0;
		var avg:Float = 0;
		var count:Int = 0;

		while(start1 < end1){
			sum += start1;
			start1 += 1;
			count += 1;
		}
		avg = sum/count;
		return avg;
	}

	def main(args:Array[String]){
		try {
			println("Enter starting of numbers");
			var start:Int = readInt();
			println("Enter ending of numbers");
			var end:Int = readInt();

			var avg = average(start,end);
			println("Average is"+avg);
		}
		catch {
			case e : Exception => {
				println("Invalid input");		
			}
		}	
	}
}