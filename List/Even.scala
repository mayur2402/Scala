/*
Create a list of even numbers up to 10 and calculate its product
*/

object Even{

    def main(args:Array[String]){

        var list:List[Int] = List.range(2,10,2);

        var sum:Int = 1;

        for (x <- list){
            sum *= x;
        }

        println(sum)

        var sumx = 1;
        list.foreach( sumx *= _)

        println(sumx);
    }
}