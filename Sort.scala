import java.util._
object Sort {
	def main(args : Array[String]) {

		if (args.length == 0) {
			println("Enter valid numbersin arguments")
			System.exit(-1)
		}

		var arr : Array[Int] = new Array[Int](args.length)

		for (i <- 0 to args.length - 1) {
			arr(i) = Integer.parseInt(args(i))
		}

		for (i <- 0 to args.length - 1) {
			print(arr(i)+"\t")
		}
		println()

		Arrays.sort(arr)

		for (i <- 0 to args.length - 1) {
			print(arr(i)+"\t")
		}
		println()
	}
}