class CopyConstructor{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "hardik";
        s1.roll = 12;

        Student s2 = new Student();
        s1.name = "Rekha";
    }
}

class Student{
    String name;
    int roll;
    
    Student(Studnt s1){
        this.name =s1.name;
        this.roll = s1.roll;
    }
}