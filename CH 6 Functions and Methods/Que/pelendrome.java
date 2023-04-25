public class pelendrome{
    public static boolean pelendro(int n){
        int rem,pow = 1,pel = 0;
        int check = n;
        while(n>0){
            rem = n % 10;
            pel = (int)(pel * Math.pow(10, pow)) + rem;

            n /=10;
        }

        if(pel == check)
            return true;     
        else
            return false;
        
    }

    public static void main(String[] args) {
        System.out.println(pelendro(121));
    }
}