import scala.io.StdIn.{readInt}

object SwitchCase{
	def main(args:Array[String]){
		
		var month : Int = 0;

		println("Enter month number")
		month = readInt()

		month match {
			case 1 => println("Jan")
			case 2 => println("Feb")
			case 3 => println("Mar")
			case 4 => println("April")
			case 5 => println("May")
			case 6 => println("June")
			case 7 => println("July")
			case 8 => println("Aug")
			case 9 => println("Sep")
			case 10 => println("Oct")
			case 11 => println("Nov")
			case 12 => println("Dec")
		}

		var Month = month match {
			case 1 => "Jan"
			case 2 => "Feb"
			case 3 => "Mar"
			case 4 => "April"
			case 5 => "May"
			case 6 => "June"
			case 7 => "July"
			case 8 => "Aug"
			case 9 => "Sep"
			case 10 => "Oct"
			case 11 => "Nov"
			case 12 => "Dec"
		}
		println(Month)

		var age : Int = 0

		println("Enter your age")
		age = readInt()

		age match {
			case a if 0 to 12 contains a => println("Child")
			case b if 13 to 19 contains b => println("Teen")
			case c if 20 to 30 contains c => println("Adult")
		}
	}
}