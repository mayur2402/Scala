object Math{
	def add(no1:Int,no2:Int):Int = {
		return no1+no2;
	}
	def sub(no1:Int,no2:Int):Int = {
		return no1-no2;
	}
	def mul(no1:Int,no2:Int):Int = {
		return no1*no2;
	}
	def div(no1:Int,no2:Int):Int = {
		return no1/no2;
	}
	
	def main(args:Array[String]){
		var a = add(20,20);
		println(a);
		a = sub(20,30);
		println(a);
		a = mul(20,20);
		println(a);
		a = div(20,20);
		println(a);
		
	}
}
