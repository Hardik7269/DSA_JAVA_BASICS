import java.util.ArrayList;

class SplitArrayLargestSum{
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr, 2));

    }

    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for(int i = 0 ; i < nums.length ; i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }

        while(start < end){
            int mid = start + (end-start)/2;


            int sum = 0;
            int piece = 1;//******************** MOST IMP PART atleast one piece is there */

            for(int num : nums){
                
                if((num + sum) > mid){
                    //its exciding the limite so the new piece will be added and 
                    //and in new array the sum will be equal to the present element
                    sum = num;
                    piece++;
                }else{
                    sum += num;
                }
            }
            if(piece > k){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;//or start (end start and mid are at the same position in the ans)
    }

}