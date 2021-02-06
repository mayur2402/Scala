/*
Create abstract class Order (id, description). Derive two classes PurchaseOrder&amp;
SalesOrder with members Vendor and Customer. Create object of each PurchaseOrder and
SalesOrder. Display the details of each account
*/
import scala.io.StdIn.{readInt,readLine,readDouble}

abstract class Order(var id:Int,var description:String){

	def productDetails{
		println("Id of Product "+id+"\nDescription of Product "+description)
	}

	def details
}

class PurchaseOrder(cid:Int,cname:String,pid:Int,quantity:Int,amount:Double,id:Int,description:String) extends Order(id,description){
	var customer:String = cname

	def customerDetails{
		println("customer id is "+cid+" Name "+customer)
	}

	def details{
		var total:Double = quantity * amount
		println("product id "+pid+" Total amount of "+quantity+" product is "+total)
	}
}

class SalesOrder(cid:Int,vname:String,pid:Int,quantity:Int,amount:Double,id:Int,description:String) extends Order(id,description){
	var vendor:String = vname

	def venderDetails{
		println("Vendor name is "+vendor)
	}

	def details{
		println(quantity+" product id "+pid+"to the "+cid+" with Total price "+(quantity*amount))
	}
}

object OrderObj{
	def main(args:Array[String]){

		println("How many orders")
		var order:Int = readInt()
		var po:Array[PurchaseOrder] = new Array[PurchaseOrder](order)
		var so:Array[SalesOrder] = new Array[SalesOrder](order)

		var i:Int = 0
		while(i < order){

			println("-----------------------------------------")
			println("Enter Customer details")
			println("Enter customer id")
			var cid:Int = readInt()
			println("Enter customer name")
			var cname:String = readLine()
			println("-----------------------------------------")
			println("Enter product details")
			println("Enter product id")
			var pid:Int = readInt()
			println("Enter quantity of product")
			var quantity:Int = readInt()
			println("Enter amount of product")
			var amount:Double = readDouble()
			println("-----------------------------------------")
			println("Enter order id")
			var id:Int = readInt()
			println("Enter order description")
			var description:String = readLine()
			println("-----------------------------------------")
			println("Enter Vendor name")
			var vname:String = readLine()

			po(i) = new PurchaseOrder(cid,cname,pid,quantity,amount,id,description)
			so(i) = new SalesOrder(cid,vname,pid,quantity,amount,id,description)

			i += 1
		}
		i = 0
		println("-------------------PurchaseOrder--------------------")
		while(i < order){
			po(i).customerDetails
			po(i).productDetails
			po(i).details
			i += 1
		}
		i = 0
		println("---------------------SalesOrder-==------------------")
		while(i < order){
			so(i).venderDetails
			so(i).productDetails
			so(i).details
			i += 1
		}
	}
}