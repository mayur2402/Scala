import java.util._;

object UpperTriangle{

    def upper(arr:Array[Array[Int]],r:Int,c:Int){
        var flag:Int = 0;
        for(i <- 0 to r-1){
            for(j <- 0 to c-1){
                if(i > j){
                    if(arr(i)(j) == 0){
                        flag = 1;
                    }
                    else{
                        flag = 0;
                    }
                    print(arr(i)(j)+"\t");
                }
            }
            println();
        }
        if(flag == 0){
            println("Not Upper Triangular matrix");
        }
        else{
            println("Upper Triangular matrix");
        }
    }

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
            upper(arr,row,col);
        }
        catch {
			case e:Exception => {
				println("Error");
			}
		}
    }
}