import scala.util.control._;

object Loop{
    def main(args:Array[String]){

        var no:Int = 1;
        while(no != 20){
            print(no+"\t");
            no += 1;
        }

        var i:Int = 0;
        for(i <- 1 to 20){
            println("i = \t"+i);
        }

        for(j <- 20 to 30;k <- 40 until 50){
            println("j\t"+j+"\tk\t"+k);
        }

	var list = List(2,3,4,5,6,7);

	for(l <- list){
		println("l = \t"+l);
	}

	for{l <- list; if(l != 3)}{println("l = \t"+l);}

	var loop = new Breaks;
	var num = 0;
	loop.breakable{
		while(true){
			println("num = \t"+num);
			num += 1;

			if(num == 10){
				loop.break;
			} 
		}
	}
	
    }
}
