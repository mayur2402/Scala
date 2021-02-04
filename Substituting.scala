object Substituting{
	def main(argument:Array[String]){
		var name = "Devarshi";
		var rollno = 47;
		var address = "Alandi Devachi";
		var salary = 12000;

		println("$name is live at $address and roll number is $rollno");
		println(s"$name is live at $address and roll number is $rollno");
		println(s"salary is $salary and after 5 year salary become ${salary*5}");
	}
}