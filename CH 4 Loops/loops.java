import java.util.Scanner;

public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       /* int n = sc.nextInt();
        int count = 0;
        int i = 1;
        int nothing = 0;
        while(i<=n){
            int condition = (n%i == 0) ? count++ : nothing++ ;

            // if (n%i == 0){
            //     count++;
            // }
            i++;
    }
    if (count == 2){
        System.out.println("Prime number");
    }else
        System.out.println("Not Prime");
        System.out.println("count= "+count);*/
        
        int sumeven = 0;
        int sumodd = 0;
        for(int i = 0 ; i<5 ; i++){
            int a = sc.nextInt();
            
            if (a %2 == 0){
                sumeven += a;
            }else {
                sumodd += a ;
            }
        }
            System.out.println("Sum of even numbers = "+ sumeven);
            System.out.println("Sum of Odd numbers = "+ sumodd);

    }
}