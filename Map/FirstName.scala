import java.util._;

object FirstName{

    def main(args:Array[String]){

        val sc = new Scanner(System.in);

        println("How many Students");
        val no : Int = sc.nextInt();

        var map = scala.collection.mutable.Map[Int,String]();

        for(i <- 0 until no){

            println("Enter Roll number");
            var roll : Int = sc.nextInt();

            println("Enter first name of student");
            var fname : String = sc.next();

            map(roll) = fname;

        }

        println(map);

        for(key <- map.keys){

        }
    }
}