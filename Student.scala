case class Student(
	name:String,
	age:Int,
	weight:Float
)

object Student{
	def main(args:Array[String]){
		val sagar = new Student("sagar",21,200);
		var name:String = "aniket";
		var age:Int = 21;
		var weight:Float = 100;

		println(s"${sagar.name}'s age is ${sagar.age}");

		println(f"${sagar.name}'s weight is ${sagar.weight}%.2f");

		println("This is \n Example");

		println(raw"This is \n Example");

		println("%s name %d age %.2f weight".format(name,age,weight));
	}
}

