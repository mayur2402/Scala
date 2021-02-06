import scala.io.StdIn.{readLine,readChar};

object Occurance{

	def main(args:Array[String]){
		try {
			println("Enter String");
			var str = readLine();
			println("Enter Character");
			var ch = readChar();

			var count:Int = 0;
			
			for(x <- str){
				if(ch == x){
					count += 1;
				}
			}

			println("Occurance of "+ch+" in "+str+" are "+count);
		}
		catch {
			case e:Exception => {
				println(e);
			}
		}
	}
}