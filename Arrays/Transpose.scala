import java.util._;

object Transpose{

    def transpose(arr:Array[Array[Int]],r:Int,c:Int) = {
        def ans = Array.ofDim[Int](r,c);
        for(i <- 0 to r-1){
            for(j <- 0 to c-1){
                ans(i)(j) = arr(j)(i);
                print(arr(j)(i)+"\t");
            }
            println();
        }
/*
        for(i <- 0 to r-1){
            for(j <- 0 to c-1){
                print(ans(i)(j)+"\t");
            }
            println();
        }
    }
    */

    def main(args:Array[String]){
		val sc = new Scanner(System.in);
		try{
			println("How many rows in matrix");
			val row:Int = sc.nextInt();
            println("How many columns in matrix");
			val col:Int = sc.nextInt();

			if(row <= 0 || col <= 0){
				println("Error");
				System.exit(-1);
			}

			var arr = Array.ofDim[Int](row,col);

			var i = 0;
            var j = 0;

		    for(i <- 0 to row-1){
                for(j <- 0 to col-1){
                    println("Enter element ");
				    arr(i)(j) = sc.nextInt();
                }
            }

            transpose(arr,row,col);
        }
        catch {
			case e:Exception => {
				println("Error");
			}
		}
    }
}