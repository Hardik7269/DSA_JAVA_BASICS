public class Bit{
    public static void allOperators(){
        System.out.println("5 & 4 : "+(5 & 4));
        System.out.println("5 | 4 : "+(5 | 4));
        System.out.println("5 ^ 4 (XOR) "+(5 ^ 4));
        
        System.out.println(~-4);

        System.out.println(5<<2);
    }
    public static int getIthBit(int n,int i ){
        int Bitmask = 1 << i;
        if((n & Bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
        
    }
    public static int setIthBit(int n , int i){
        int Bitmask = 1 << i ;
        return n | Bitmask ;
    }
    public static int clearIthBit(int n , int i){
        int Bitmask = 1 << i ;
        return n & Bitmask;
    }
    public static int updateIthBit(int n , int i , int bit){
       if (bit == 0){
        return clearIthBit(n, i);
       }else {
        return setIthBit(n, i);
       }
       
       // same code from the video but its not working for me 
        // n = clearIthBit(n, i);
        // int Bitmask = bit << i;
        // return n | Bitmask;
    }
    public static String isOddEven(int n){
        if((n & 1) == 1){
            return "Odd Number";
        }else{
            return "Even Number";
        }
    }

    public static boolean is2spowerOrNot(int n){
        if((n & (n-1)) == 0){
            return true;
        }else {
            return false;
        }
    }   

    public static int fastExponentiation(int n, int pow){
        int ans = 1;
        while(pow > 0){
            if((pow&1) == 1){
                ans = ans * n;
            }
            n *= n ;
            pow = pow>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        // allOperators();
        // System.out.println(getIthBit(7, 1));
        // System.out.println(isOddEven(8));
        // System.out.println(updateIthBit(10, 2, 1));
        // System.out.println(is2spowerOrNot(8));
        System.out.println(fastExponentiation(3, 5));
    }
}