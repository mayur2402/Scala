object Scala{

    def number{

        var num : Int = 20;

        println(num);

        var float : Float = 20.202022f;

        println(float);

        var double : Double = 20.2020;

        println(double);

    }

    def string{

        var str : String = "John cena";

        println(str);

        println(str.toLowerCase());

        println(str.toUpperCase());

        println(str.charAt(3));

        for (s <- str.toCharArray()){
            println(s);
        }
    }

    def main(args:Array[String]){

//        number;
        string;
    }
}