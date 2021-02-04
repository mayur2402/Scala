object StringSplit{
	def main(arg:Array[String]){
		var color = "violet,Indigo,Blue,Green,Orange,Red";

		var intro2 = """scala is a programming language
		just like java.
		we can use '==' to compare strings""";

		for(s <- color.split(",")){
			println(s);
		}
		for(s <- intro2.split(" ")){
			println(s);
		}
	}
}