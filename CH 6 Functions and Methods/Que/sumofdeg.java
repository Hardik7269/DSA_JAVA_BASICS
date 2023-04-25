public class sumofdeg{
    public static int sumofdeg(int n){
        int rem , sum = 0;
        while(n>0){
            rem = n%10;
            sum = sum + rem;
            n /=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumofdeg(12356));
    }
}