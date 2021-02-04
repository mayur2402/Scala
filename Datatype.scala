object Datatype{
	def main(args : Array[String]){
		println(Int.MinValue);
		println(Int.MaxValue);

		println(Float.MinValue);
		println(Float.MaxValue);

		var num = "20";

		println(num+" "+num.getClass.getName)

		println(num.toInt+" "+num.toInt.getClass.getName);

		var random = scala.util.Random;

		println(random.nextPrintableChar);

		println(random.nextInt(40));

		for(i <- 1 to random.nextInt(10)){
			println(i);
		}

		var character = for(i <- 0 to 4) yield random.nextPrintableChar;

		println(character);

		var range = 1 to 10;

		println(range);

		for (i <- range){
			println(i * 2);
		}

		var rangex = 1 to 10 by 2;

		println(rangex);

		var rangexx = 1 until 10;

		println(rangexx);

		var arr = range.toArray;

		var pi = scala.math.Pi

		println(pi)

		println(f"$pi%1.5f")

		var formate = java.text.NumberFormat.getCurrencyInstance;

		println(formate.format(20000000))
	}
}