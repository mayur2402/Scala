object MultiLineString{
	def main(args:Array[String]){
		var intro = """scala is a programming language
		just like java.
		we can use '==' to compare strings""";

		println(intro);

		var intro2 = """scala is a programming language
		|just like java.
		|we can use '==' to compare strings""".stripMargin;

		println(intro2);

		var intro3 = """scala is a programming language
		|just like java.
		|we can use '==' to compare strings""".stripMargin.replaceAll("\n","space");

		println(intro3);
	}
}