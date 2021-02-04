/*
scalac -Xprint:parse Control_structure.scala
*/

object Control_structure{
	def main(args:Array[String]){
		var x  = if(2+2 == 4) true else false;
		println(x);

		var fruits = List("apple","mango","grapes","banana");

		var Fruit = for(fruit <- fruits) yield fruit.capitalize;

		println(Fruit);

		Fruit.foreach(println);

		var num = Array(20,30,40,50);

		for((number,counter) <- num.zipWithIndex){
			print(counter,number," ");
		}
		println();

		for(i<- 0 to num.length){
			print(i+" ")
		}
		println();

		for(i <- 0 until num.length){
			print(i+" ");
		}
		println();

		for(i <- 1 to 10 if(i < 5))	println(i);

		var lang = Map("aniket" -> "java","dhole" -> "C++");

		println(lang);

		for((k,v) <- lang){
			print(k," ",v);
		}
		println();
	}
}