/*
You want to compare two strings to see if they’re equal, i.e., whether they contain the
same sequence of characters.
*/
object StringCompare{
	def main(args:Array[String]){
		var s1 = "mayur";
		var s2 = "MAYUR";
		println("Using == operator");
		if(s1 == s2){
			println(s1+" is equal to "+s2);
		}
		else{
			println(s1+" is not equal to "+s2);
		}

		println("Using == operator and toLowerCase");
		if(s1.toLowerCase == s2.toLowerCase){
			println(s1+" is equal to "+s2);
		}
		else{
			println(s1+" is not equal to "+s2);
		}

		println("Using equalsIgnoreCase()");
		if(s1.equalsIgnoreCase(s2)){
			println(s1+" is equal to "+s2);
		}
		else{
			println(s1+" is not equal to "+s2);
		}

		println(s1.equals(s2));
		println(s1.equals(s2.toLowerCase));
	}
}