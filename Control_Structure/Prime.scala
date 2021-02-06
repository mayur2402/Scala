object Prime{

	def prime(num:Int){
		var sum:Int = 0;
		for(no <- 2 to num){
			var flag:Boolean = true;
			for(j <- 2 to (no-1)){
				if(no % j == 0){
					flag = false;
				}
			}
			if(flag == true){
				sum += no;
			}
		}
		println(sum);
	}

	def main(args:Array[String]){
		prime(100);
	}
}