import java.util.*;
public class test{
    public static void main(String[] args) {
        int a[][] = new int [3][3];
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j <a[0].length ; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j <a[0].length ; j++){
                min = Math.min(min, a[i][j]);
                max = Math.max(max, a[i][j]);
            }
        }
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j <a[0].length ; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Minimum value : "+min+" and Maximum value : "+max);
        
    }
}