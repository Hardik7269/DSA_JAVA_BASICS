import java.util.Scanner;

public class conditional{
    /*public static void main(String args[]){
        int age = 19;
        String adult = (age>=18) ? "Adult" : "Young";//Ternary Operator
        System.out.println(adult);
    }*/

    /*public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        switch(num){
           
            case 1  : System.out.println("Sunday");
            break;
            case 2  : System.out.println("monday");
            break;
            case 3  : System.out.println("Sunday");
            break;
            case 4  :System.out.println("Sunday");
            break;
            case 5  : System.out.println("Sunday");
            break;
            case 6  : System.out.println("Sunday");
            break;
            case 7  : System.out.println("Sunday");
            break;
            default : System.out.println("Enter valid number");
            break;
    }
    }*/

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0){
            if (year%100 == 0){
                if(year % 400 == 0)
                    System.out.println("Yes its leap year");
                else
                    System.out.println("Not leap year");
            }else {
                
                System.out.println("Yes leap year");
            }
            
        }else {
            System.out.println("Not leap year");
        }
    }
}


