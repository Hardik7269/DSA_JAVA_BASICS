import java.util.*;
public class bintodec{

    public static int bintodec(int n){
        int dec = 0;
        int pow = 0;
        int lastdeg;

        while(n>0){
            lastdeg = n %10;
            dec = dec + (lastdeg *(int) Math.pow(2,pow));
            n = n/10;
            pow ++;
        }
        return dec;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(bintodec(n));
    }
}