/*
Create Lists using five different methods( Lisp style , Java style, fill, range and tabulate
methods)
*/
object ListType{
    def main(args:Array[String]){
        var list1 = List(20,30,40,50,60);

        println(list1);

        var list2 = List.range(60,66)

        println(list2);

        var list3 = List.fill(5)("scala")

        println(list3);

        var list4 = List.tabulate(5)(n => n + n)

        println(list4);

        var list5 = "Dev"::"Aniket"::"Sagar"::Nil;

        println(list5);
    }
}
