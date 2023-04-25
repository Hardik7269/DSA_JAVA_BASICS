import javax.print.attribute.standard.RequestingUserName;
import javax.sound.midi.MidiChannel;

public class questionsarray{

    public static boolean que1(int nums[]){
        for(int i = 0 ; i<nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++ ){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static int que2(int a[],int key){
        int pivot = 4;
        int start = 0 , end = a.length , mid ;
        while(start < end ){
            if(key == a[pivot]){
                return pivot;
            }
            else if(key > a[pivot] && key <= a[end - 1]){
                start = a[pivot]+1;
                end = a.length;
                while(start <= end ){
                    mid = (start + end)/2;
                    if(key == a[mid]){
                        return mid;
                    }else if(key < a[mid]){
                        end = mid-1;
                    }else{
                        start = mid + 1;
                    }
                }
            }else if(key > a[a.length - 1]){
                start = 0 ;
                end = a[pivot - 1];
                mid = (start - end)/2;
                while(start <= end){
                    mid = (start + end)/2;
                    if(key == a[mid]){
                        return mid;
                    }else if(key < a[mid]){
                        end = mid-1;
                    }else{
                        start = mid + 1;
                    }
                }
            }
            else{
                return -1;
            }
        }
        return -1;
    }

    public static int que3(int a[]){
        int maxProfit = Integer.MIN_VALUE;
        boolean checkProfit = false;
        for(int i = 1 ; i < a.length ; i++){
                for(int j = 0; j<i; j++){
                    if(a[j] < a[i]){
                        checkProfit = true;
                        int profit = a[i] - a[j];
                        if(profit > maxProfit){
                            maxProfit = profit;
                        } 
                    }
                }
        }
        if(checkProfit == true){
            return maxProfit;
        }
        return 0;
    }
    public static int que4(int a[]){
        int leftMaximum[] = new int [a.length];
        int rightMaximum[] = new int [a.length];
        int Total_trappedWater = 0;
        for(int i = 0 ; i < a.length ; i++){
            leftMaximum[i] = i ==0 ? a[i] : Math.max(leftMaximum[i-1], a[i]);
        }
        for(int i = a.length -1 ; i >=0 ; i--){
            rightMaximum[i] = i == a.length -1 ? a[a.length - 1] : Math.max(rightMaximum[i+1], a[i]);
        }
        for(int i = 0 ; i < a.length ; i++){
            int Trapped_Water = (Math.min(rightMaximum[i], leftMaximum[i]) - a[i]);
            Total_trappedWater = Total_trappedWater + Trapped_Water;
        }
        return Total_trappedWater;
    }
    

    public static void main(String[] args) {
        // int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        // System.out.println(que1(nums));
        // int a[] = {4,5,6,7,0,1,2};
        // System.out.println("Key is at index : "+ que2(a, 3));//pivot is at position 4
        // int a [] = {7, 1, 5, 3, 6,  4};
        // System.out.println("Maximum profit is : "+que3(a));
        //for trapped water question
        // int a [] = {4, 2, 0, 3, 2, 5};
        // System.out.println("Total Trapped Water is : "+que4(a));

    }
}