object Merge{

    def main(args:Array[String]){

        var set1 : Set[Int] = Set(2,3,4,5);

        var set2 : Set[Int] = Set(6,7,8);

        var ans : Set[Int] = set1 ++ set2;

        println(ans);

        var prod : Int = 1;
        var sum : Int = 0;
        var count : Int = 0;
        
        for (x <- ans){
            prod = prod * x;
            sum = sum + x;
            count = count + 1;
        }

        println(prod);

        println(sum/count);
    }
}