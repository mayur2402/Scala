object CommandLine{
	def main(args:Array[String]){
		var i :Int = 0;

		while(i < args.length){
			println(args(i))
			i += 1;
		}
	}
}