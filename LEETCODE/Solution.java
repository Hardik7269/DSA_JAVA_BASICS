import java.util .*;

class Solution{
    public static int addBinary(String a, String b) {
        int i = a.length()-1;
        int pow = 0;
        int sum = 0;
        double ch;
        while(i>=0){
            if(a.charAt(i) == '1'){
                ch = Math.pow(2,pow);
                sum += ch;
                pow++;
            }else{
                pow++;
            }
            i--;
        }
        int j = b.length()-1;
        pow = 0;
        while(j>=0){
            if(b.charAt(j) == '1'){
                ch = Math.pow(2,pow);
                sum+= ch;
                pow++;
            }else{
                pow++;
            }
            j--;
        }
        return  sum;
    }
    public static void main(String[] args) {
        String a = "1101";
        String b = "1";
        System.out.println(addBinary(a, b));
    }
}