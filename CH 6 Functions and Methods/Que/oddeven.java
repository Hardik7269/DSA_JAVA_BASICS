public class oddeven{
    public static boolean oddeven(int a) {
        if(a%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(oddeven(7));
    }
}