/*
Create a list of 50 members using function 2n+3. Create second list excluding all elements
multiple of 7
*/
object Multiple7{

    def main(args:Array[String]){

        var list1:List[Int] = List.tabulate(50)(n => 2*n + 3);

        var list:List[Int] = list1.filter(_ % 7 != 0);

        println(list);
    }
}