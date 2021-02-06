import scala.util.Sorting.quickSort;
import scala.io.StdIn.readInt;

object SecondMax{
	def main(args:Array[String]){

		var arr:Array[Int] = new Array[Int](4);
		println("Enter four numbers");
		
		for(i <- 0 to 3){
			arr(i) = readInt();
		}

		for(i <- arr){
			print(i+"\t");
		}
		println();

		quickSort(arr);

		var len = arr.length;
		
		println("Second max number is "+arr(len-2));
	}
}