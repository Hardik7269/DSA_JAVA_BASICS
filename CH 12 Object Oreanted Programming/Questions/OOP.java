import java.util.ArrayList;
import java.util.Scanner;
public class OOP{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String>dates = new ArrayList<String>();
        
        {
            // System.out.print("Enter Real number of A : ");
            // int r1 = sc.nextInt();
            // System.out.print("Enter Imagionary number of A : ");
            // int i1 = sc.nextInt();
            // System.out.print("Enter Real number of B : ");
            // int r2 = sc.nextInt();
            // System.out.print("Enter Imagionary number of B : ");
            // int i2 = sc.nextInt();

            // Complex cp = new Complex();

            // System.out.println("Sum : "+cp.sum(r1, r2, i1, i2));
            // System.out.println("Diff : "+cp.diff(r1, r2, i1, i2));
            // System.out.println("Product : "+cp.product(r1, r2, i1, i2));
        }
    
    }
}

class Complex{ // formula is wrong
    String sum  (int r1, int r2, int i1, int i2){
        return (r1 + r2)+"+"+(i1 + i2)+"i";
    }
    String diff (int r1, int r2, int i1, int i2){
        return (r1 - r2)+"-"+(i1 - i2)+"i";
    }
    String product(int r1, int r2, int i1, int i2){
        return (r1*r2 - i1*i2)+"+"+(r1*i2 + r2*i1)+"i";
    }
}