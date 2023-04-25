import java.util.*;
public class SortedMatrixSerch{
    public static boolean matrixSearch(int a[][], int key){
        int row = a.length -1;
        int col = 0;
        
        while(row >=0 && col <= a[0].length-1){
            int currPosition = a[row][col];
            if(key == currPosition){
                return true;
            }else if(key > currPosition){
                col++;
            }else{
                row--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[][] = {{10,20,30,40},
                    {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50}};
        int key = 30;
        System.out.println(matrixSearch(a, key));
    }
}