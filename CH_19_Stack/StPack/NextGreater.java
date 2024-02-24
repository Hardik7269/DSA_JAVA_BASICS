package StPack;
import java.util.*;
public class NextGreater {

    public static int[] greater(int [] arr){
        Stack<Integer> s = new Stack<>();
        int i = 0 ;
        int [] b = new int[arr.length];
        while(i == arr.length-1){
            s.push(arr[i]);
            i++;
        }
        b[arr.length-1] = -1;
        
    }
    public static void main(String[] args) {
        int a [] = new int[] {6,8,0,1,3};
        greater(a);
    }
}
