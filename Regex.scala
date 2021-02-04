object Regex{
	def main(args:Array[String]){
		var pattern1 = "[0-9]+".r;
		var pattern2 = "[a-z]+".r;

		var address = "no 234 main street california";

		var find1 = pattern1.findFirstIn(address);
		var find2 = pattern2.findAllIn(address);

		println(find1);
		for(s <- find2){
			println(s);
		}
	}
}