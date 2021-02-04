import scala.util.control._

object Prime{
	def main(args:Array[String]){
		var num : Int = 100

		var i : Int = 2
		var j : Int = 0
		var flag : Boolean = true

		var loop = new Breaks

		while(i <= num){
			j = 2;
			loop.breakable
			{
				while(j <= i/2){
					if(i % j == 0){
						flag = false
						loop.break
					}
					j += 1
				}
			}
			if(flag == true){
				println(i)
			}
			flag = true
			i += 1
		}
	}
}