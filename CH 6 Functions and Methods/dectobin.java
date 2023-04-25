public class dectobin{
    public static int dectobin(int n){
        
        int bin = 0;
        int pow = 0;
        
    while(n > 0){
       int rem = n%2;
        bin = bin +(rem *(int) Math.pow(10, pow));
        n = n/2;
        pow++;
        }
        System.out.println(bin);
        return bin;
    }
    
    public static void main(String args[]){
        System.out.println("Decimal 8 binary number is "+ dectobin(7));
    }
}