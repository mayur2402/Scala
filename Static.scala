class Point(val no1:Int,val no2:Int){
    val n1:Int = no1
    val n2:Int = no2

    def Display(){
        println(n1+" "+n2);
    }
}

object Static{
    def main(args:Array[String]){
        val point = new Point(2,3);
        point.Display();
    }
}