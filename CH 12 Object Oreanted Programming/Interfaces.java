public class Interfaces{
    public static void main(String args[]){
        human h = new human();
        h.eat();
        System.out.println(h.color);
    }
}

interface vegFood{
    int color = 8;
    void eat(); // default it's public and abstract 
}

interface nonvegFood{
    void eat(); // abstraction because it's blueprint defined in fun hide it and implement in subclass only 
}

class human implements vegFood , nonvegFood {
    public void eat(){
        System.out.println("food");
    }
}