public class Inheritance{
    public static void main(String args[]){
        Fish fs = new Fish();
        fs.whatDo();
    }
}

class Animal {
    int lags;

    void whatDo(){
        System.out.println("Eats food good");
        // lags = 4;
    }
}

class Fish extends Animal{
    String Veg ;

    void doing(){
        eat = "vegfood";
        veg = "non veg";
        legs = 0;
    }
}