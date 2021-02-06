import java.util._;

object MaxMinArray{

	def maxfun(arr:Array[Int]) : Int = {
		var max = arr(0);
		for(i <- 1 to (arr.length-1)){
			if(arr(i) > max){
				max = arr(i);
			}
		}
		return max;
	}

	def minfun(arr:Array[Int]) : Int = {
		var min = arr(0);
		for(i <- 1 to (arr.length-1)){
			if(arr(i) < min){
				min = arr(i);
			}
		}
		return min;
	}

	def main(args:Array[String]){
		val sc = new Scanner(System.in);
		try{
			println("How many elements in array");
			var size:Int = sc.nextInt();

			if(size <= 0){
				println("Error");
				System.exit(-1);
			}
			var arr = new Array[Int](size);
			var i = 0;
			while(i < size){
				println("Enter element ");
				arr(i) = sc.nextInt();
				i += 1;
			}
			
			var max = maxfun(arr);
			var min = minfun(arr);

			println("Max element of array is "+max);
			println("Min element of array is "+min)
		}
		catch {
			case e:Exception => {
				println("Error");
			}
		}
	}
}