public class Superkeyword{
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color = "any";
    Animal(){
        System.out.println("default animal constructor");
    }
    void walk(){
        System.out.println("not every one walk");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor");
    }
    void walk(){

        System.out.println("dont walk mf runs ");
    }
}
