import java.util._;
//////////////////////////////////////////////////
//
//	0,0	0,1 0,2
//	1,0	1,1	1,2
//	2,0	2,1	2,2
//
//////////////////////////////////////////////////
object Determinant{

	def determinant(arr:Array[Array[Int]],row:Int,col:Int) = {
		
		for(i <- 0 to row-1){
			for(j <- 0 to col-1){
				print(arr(i)(j)+"\t")
			}
			println()
		}

		for(i <- 0 to row-1){
			if(i == 0){
				for(j <- 0 to row-1){
					for(k <- 0 to col-1){
						if(j != k){
							ans = 
						}
					}
				}
			}
		}
	}

	def main(args:Array[String]){
		try {
			val sc = new Scanner(System.in)
			println("How many rows")
			var row:Int = sc.nextInt()
			println("How many Columns")
			var col:Int = sc.nextInt()

			if(row != col){
				println("Number of rows and columns should be same")
			}

			var arr = Array.ofDim[Int](row,col)
			var i = 0;
			var j = 0;

			for(i <- 0 to row-1){
				for(j <- 0 to col - 1){
					println("Enter Number")
					arr(i)(j) = sc.nextInt();
				}
			}

			determinant(arr,row,col);
		}
		catch {
			case e :Exception => {
				println(e)
			}
		}
	}
}