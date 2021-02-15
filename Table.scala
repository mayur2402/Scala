object Table {
	def main(args : Array[String]) {
		try {
			if (args.length != 1) {
				println("Enter only one argument")
				System.exit(-1)
			}

			var num : Int = Integer.parseInt(args(0))
			var i = 0

			for (i <- 1 to 10) {
				println(i*num)
			}
		} 
		catch {
			case n : NumberFormatException => {
				println("Enter valid number")
			}
			}

		}
	}