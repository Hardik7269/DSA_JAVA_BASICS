class Xpower{

    public static int optimised_power(int x, int n){
        int power;
        if( n == 0){
            return 1; 
        }
        int half_power = optimised_power(x, n/2);
        power = half_power * half_power;
        if(n%2 != 0){
            power = x  * power;    
        }
        return power;
    }
    
    public static int power(int x  , int p){
        if (p == 0){
            return 1;
        }
        x = x * power(x,p-1);
        return x;
    }
    public static void main(String[] args) {
        // System.out.println(power(2,6));
        System.out.println(optimised_power(5, 2));
    }

}