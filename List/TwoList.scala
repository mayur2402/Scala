/*
Write a program to create a list of 1 to 100 numbers. Create second list from first list
selecting numbers multiple of 10.
*/

object TwoList{

    def main(args:Array[String]){

        var list1:List[Int] = List.range(1,100);

        var list:List[Int] = list1.filter(_ % 10 == 0);

        println(list);
    
    }
}