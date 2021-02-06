import scala.util._;

object Random{
	def main(args : Array[String]){
		var no:Int = 1;

		var random = new Random;

		while(no <= 5){
			var n = random.nextInt(10);
			var temp = n;
			var ans : Int = 0;
			var i : Int = 0;

			i = 1;

			while(i <= n/2){

				if(n % i == 0){
					ans = ans + i;
				}
				i += 1;
			}

			if(temp == ans){
				println(temp+" is Perfect number");
			}
			else{
				println(temp+" is not Perfect number");
			}
			ans = 0;
			no += 1;
		}
	}
}