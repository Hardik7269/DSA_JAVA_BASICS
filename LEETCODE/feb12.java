public class feb12{
        public static long findTheArrayConcVal(int[] nums) {
            
            long overall = 0 ; 
            long rem;
            if(nums.length == 1){
                overall = nums[0];
                return overall;
            }
            for(int i = 0 ; i <= nums.length/2 ; i++){
                long sum = 0;
                int pow = 0;
                int n1 = nums[i];
                while(nums[nums.length - 1 - i] > 0){
                    rem = nums[nums.length - 1 - i] % 10;
                    sum =sum + (long)(rem * Math.pow(10 ,pow));
                    pow++;
                    nums[nums.length - 1 - i] = nums[nums.length - 1 - i] / 10;
                }
                while(nums[i] > 0){
                    rem = nums[i] % 10;
                    sum =sum + (long)(rem * Math.pow(10 ,pow));
                    pow++;
                    nums[i] = nums[i] / 10;
                }
                pow = 0;
                overall += sum ;
            }
            return overall;
        }


public static void main(String[] args) {
    int nums[] = {58,12,69,73};
    System.out.println(findTheArrayConcVal(nums));
}
}