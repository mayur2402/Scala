object Common{

    def main(args:Array[String]){

        var set1 : Set[Int] = Set[Int](20,30,40,50);

        var set2 : Set[Int] = Set[Int](40,50,60,70);

        println(set1);

        println(set2);

        println(set1.&(set2));
    }
}