import java.util.*;
public class primeoptimal{
    public static boolean isprim(int a){
        boolean isPrime = true;
        if(a == 2){
            return true;
        }
        for(int i = 2 ; i<=Math.sqrt(a) ; i++){
            if(a%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last range");
        int n = sc.nextInt();
        int i = 2;
        while(i <= n ){
            if(isprim(i) == true){
                System.out.print(i+ " ");
            }
            i++;
        }
    }
}