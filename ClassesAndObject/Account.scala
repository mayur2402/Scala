/*
Define a class CurrentAccount (accNo, name, balance, minBalance). Define appropriate
constructors and operations withdraw(), deposit(), viewBalance(). Create an object and
perform operations.
*/

import scala.io.StdIn.{readLine,readDouble,readInt};

class CurrentAccount(var accNo:Int,var name:String,var balance:Double,var minBalance:Double){

	def this(){
		this(0,null,0.0,0.0)
	}

	def this(accNo:Int){
		this(accNo,null,0.0,0.0)
	}

	def this(accNo:Int,name:String){
		this(accNo,name,0.0,0.0)
	}

	def this(accNo:Int,name:String,balance:Double){
		this(accNo,name,balance,0.0)
	}

	def withdraw {
		println("Enter amount to withdraw");
		var amount = readDouble();

		var withdraw = balance - amount;

		if(withdraw < minBalance){
			println("Insufficient Balance")
			return;
		}

		balance = balance - amount;

		println("withdraw successfully");
		println("Available balane is "+balance);
	}

	def deposit {
		println("Enter amount to deposit");
		var amount = readDouble();

		balance = balance + amount;

		println("Updated balance is "+ balance);
	}

	def viewBalance {
		println("Available balance is "+balance);
	}
}

object Account{
	def main(args:Array[String]){
		try {

			println("Enter account number");
			var accNo:Int = readInt();
			println("Enter account holder name");
			var name:String = readLine();
			println("Enter account balance");
			var balance:Double = readDouble();
			println("Enter account minimum Balance");
			var minBalance:Double = readDouble();

			var account = new CurrentAccount(accNo,name,balance,minBalance);
			
			var ch:Int = 0
			while(ch != 4){
				println("1.withdraw\n2.deposit\n3.viewBalance\n4.exit")
				ch = readInt();

				ch match {
					case 1 => {
						account.withdraw;
					}

					case 2 => {
						account.deposit;
					}

					case 3 => {
						account.viewBalance;
					}

				case default => println("thanks");
				}
			}
		}
		catch {
			case e : Exception => {
				println(e)
			}
		}
	}
}