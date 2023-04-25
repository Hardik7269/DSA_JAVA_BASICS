public class FindPower{
    public static double myPow(double x, int n){
       int count = 0;
        if(n < 0){
            count++;
        }
        if(n == 0){
            return 1;
        }        
        //kaam
        double halfpower = myPow(x , n/2);
        double power = halfpower * halfpower;
        if(n%2 != 0){
            power = x * halfpower * halfpower;
        }
        if(count > 0){
            System.out.println("negative");
            return 1/power;
        }
        System.out.println("+ve");
        return power;
    }
    public static void main(String[] args) {
        System.out.println(myPow(2,3));
    }
}