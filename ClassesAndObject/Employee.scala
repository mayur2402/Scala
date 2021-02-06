/*
Define a class Employee (id, name, salary). Define methods accept() and display().
Display details of employee having maximum salary.
*/
import scala.io.StdIn.{readLine,readInt,readDouble};

class Emp(var no:Int){

	var id:Array[Int] = new Array[Int](no)
	var name:Array[String] = new Array[String](no)
	var salary:Array[Double] = new Array[Double](no)

	def accept{
		var i:Int = 0;

		while(i < no){

			println("Enter id of Employee");
			id(i) = readInt();
			println("Enter name of Employee");
			name(i) = readLine();
			println("Enter salary of Employee");
			salary(i) = readDouble();
			i += 1
		}	
	
	}

	def display{
		var i:Int = 0
		var max:Double = 0.0;
		
		while(i < no){
			if(salary(i) > max){
				max = salary(i)
			}
			i += 1
		}
		i = 0
		while(i < no){
			if(max == salary(i)){
				println("maximum salary employee");
				println(id(i)+"\t"+name(i)+"\t"+salary(i))
			}
			i += 1
		}
	}
}

object Employee{
	
	def main(args:Array[String]){

		println("How many employee")
		var no:Int = readInt()

		val emp = new Emp(no)
		emp.accept
		emp.display
	}
}