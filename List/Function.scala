/*
Write a program to create list with 10 members using function 3n 2 +4n+6
*/

object Function{

    def main(args:Array[String]){

        var list = List.tabulate(10)(n => 3*n*n + 4*n + 6)

        println(list);
    }
}