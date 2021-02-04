object Switch{
	def main(args:Array[String]){
		val num = Map(
			case 1->"One",
			case 2->"two"
		)

		val num1 = num(2)
		println(num1)
	}
}