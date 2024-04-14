import java.util.Arrays;

public class TrappingRainWater{
    public static void main(String[] args) {
        // int [] arr = {4,2,0,3,2,5};

        int[] findL = new int[arr.length];
        findLeft(arr , findL);

        int[] findR = new int[arr.length];
        findRight(arr, findR);

        int sum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            sum += (Math.min(findL[i] , findR[i]) - arr[i]);
        }
        System.out.println(sum);
        // return sum;
    }

    public static void findRight(int[]arr , int[] findR){
        int max = 0;
        for (int i = arr.length-1 ; i >= 0; i--) {
            max = Math.max(max, arr[i]);
            findR[i] = max;
        }
    }

    public static void findLeft(int []arr , int [] findL){
        int max = 0;
        for(int i  = 0  ; i < arr.length ; i++){
            max = Math.max(max, arr[i]);
            findL[i] = max;
        }
    }

}