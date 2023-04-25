public class OOPs {
    public static void main(String[] args) {
        names n =  new names();
        n.setName("Hardik");
        System.out.println(n.getName());

        // hardik rich = new hardik();
        // hardik veryRich = new hardik(169);
        // System.out.println(rich.hardik(88));
    }
}

class names{
    private String name = "";

    void setName(String newName){
        this.name = newName;
    }

    String getName(){
        return this.name;
    }
        
}

class hardik{// Example fo constructor {make method of same name as class}
    hardik(){
        System.out.println("This is default constructor .....");
    }
    hardik(int n){
        System.out.print(n);
    }
}