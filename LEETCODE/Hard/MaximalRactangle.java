import java.util.*;

public class MaximalRactangle{
    public static void main(String[] args) {
        String [][] matrix = {{"1","0","1","0","0"},
                        {"1","0","1","1","1"},
                        {"1","1","1","1","1"},
                        {"1","0","0","1","0"}};
        int [][] arr = convertCharToInt(matrix);
        int [] piller = countPillers(arr);
        
        int[] stL = new int[piller.length];
        for(int i = 0 ; i < piller.length ; i++){
            stL[i] =findLeft(piller, i, stL);
        }
        
        int[] stR = new int[piller.length];
        for(int i = 0 ; i  < piller.length ; i++){
            stR[i] = findRight(piller, i, stR);
        }
        System.out.println(Arrays.toString(stL));
        System.out.println(Arrays.toString(stR));
        int max = 0;

        for(int i = 0  ; i < piller.length ; i++){
            int area = findArea(piller, stL, stR, i);
            max = Math.max(max, area);
        }
        System.err.println(max);
    }

    public static int findArea(int [] arr , int[] stL , int[] stR , int index){
        if(index == 1){
            System.out.println(stR[index]);
            System.out.println(stL[index]);
        }
        int width = (stR[index] - stL[index]) - 1;
        
        return arr[index] * width;
    }

    public static int findRight(int [] arr , int index , int[] stR){
        int curr = arr[index];
   
        while(index < arr.length){
            if(curr > arr[index]){
                return index;
            }
            index++;
        }
        return arr.length;
    }

    public static int findLeft(int [] arr , int index , int[] stF){
        int curr = arr[index];
  
        while(index >= 0){
            if(arr[index] < curr){
                return index;
            }
            index--;
        }
        return -1;
    }

    public static int[] countPillers(int[][] arr){
        int[] piller = new int[arr[0].length];
        int max = 0;
        for (int i = 0; i < arr[0].length; i++) {
            int sum = 0 ;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j][i] == 1){
                    sum++;
                }else{
                    sum =0;
                }
                max = Math.max(max, sum);
            }
            piller[i] = max;
            max = 0;
        }
        System.out.println("Piller : "+Arrays.toString(piller));
        return piller;
    }

    public static int[][] convertCharToInt(String [] [] matrix){
        int [][] arr = new int[matrix.length][matrix[0].length];
        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                arr[i][j] = Integer.parseInt(matrix[i][j]);
            }
        }
        return arr;
    }
}