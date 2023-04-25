import java.util.*;
class LonelyNo{
    public  static List<Integer> findLonely(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        //for single element
        if(nums.length == 1){
            list.add(nums[0]);
            return list;
        }

        //for 1st element
        
        if((nums[0]+1 != nums[1]) && (nums[0] != nums[1])){
            list.add(nums[0]);
            System.out.println("for first element"+list);
        }
            

        // check the array element each 
        for(int i = 1 ; i <nums.length-1 ; i++){
            //from index 1 to length
            // if( ( (nums[i]-1 == nums[i-1]) || (nums[i]+1 == nums[i+1]) ) || ( (nums[i] == nums[i+1]) || (nums[i] != nums[i-1]) ) ){
            //     System.out.println(i+" not lonely " + nums[i]);
            // }else{
            //     list.add(nums[i]);
            // }
            if((nums[i]-1 == nums[i-1])){
                continue;
            }
            if((nums[i]+1 == nums[i+1])){
                continue;
            }
            if((nums[i]== nums[i+1])){
                continue;
            }
            if((nums[i]== nums[i-1])){
                continue;
            }

            list.add(nums[i]);
        }

        //for last element

        if((nums[nums.length-1]-1 != nums[nums.length-2]) && (nums[nums.length-1] != nums[nums.length-2])){
            list.add(nums[nums.length-1]);
        }

        return list;
    }

    public static void main(String[] args) {
        int nums[] = {10,6,5,8};
        System.out.println(findLonely(nums));
    }
}