/*
Create two Lists and Merge it and store the sorted in ascending order
*/

object Merge{

    def main(args:Array[String]){

        var list1:List[Int] = List(20,40,60);

        var list2:List[Int] = List(30,50,70);

        var list:List[Int] = list1 ++ list2;
       // var list = list1 ::: list2

        println(list.sortWith(_<_));

        println(list.sorted)
    }
}