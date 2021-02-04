import java.util._;

object string{
	def main(args:Array[String]){
		var str : String = """my name is mayur
		|live at alandi""".stripMargin

		println(str);

		var arr = str.split(" ");

		arr.foreach(println)

		var fruit = "egg, milk, apple";

		println(s"$str");

		arr = fruit.split(",").map(_.trim)

		arr.foreach(println)

		var i = 20;
		var j = 20;

		println(s"${i + j}")

		println("%d+%d".format(i,j))

		var ans = i+j;

		println("%d".format(ans))
	}
	
}