object Map{
	def main(args:Array[String]){
		var name = "mayur";
		
		val infor = for(s <- name)yield s.toUpper

		println(infor);

		val inmap = name.map(c => c.toUpper)

		println(inmap);

		val _map = name.map(_.toLower);

		println(_map);

		var filter = name.filter(_ != 'y');

		println(filter);
	}
}