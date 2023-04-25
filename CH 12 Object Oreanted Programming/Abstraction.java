public class Abstraction{
    public static void main(String[] args) {
        Student st = new Student();
        st.sankhya();
        // st.howdy();
    }
}

abstract class Classroom{
    void howdy(){
        System.out.println("majama");
    }
    abstract void sankhya();
}

class Student extends Classrom{
    void sankhya(){
        System.out.println("78 students in classroom");
    }
}

class Teacher extends Classrom{
    void sankhya(){
        System.out.println("1  Teacher in classroom");
    }
}