object RegexX{
	def main(args:Array[String]){
		val regex = "[0-9]+".r;

		val address = "202 main street california ";

		val find = regex.findAllIn(address);

		println(find);

		var regex1 = "[a-z]+".r;

		var find2 = regex1.findAllIn(address);

		find2.foreach{a => println(s"address $a");}

		var pattern = "([0-9]+) ([a-z]+)".r;

		var pattern(count,name) = "123 234 main";

		println(count);

		println(name);
	}
	
}
