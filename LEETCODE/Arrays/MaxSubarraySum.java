class MaxSubarraySum{
    public static int maxSubArray(int[] nums) {
        int maxSum = 0;
        for(int i = 0 ; i <nums.length-1 ; i++ ){
            int sum = 0;
            for(int j = i ; j <nums.length ; j++){
                for(int k = i ; k <=j ;k++){
                    System.out.print(nums[k] +", ");
                }
                System.out.println();
            }
            System.out.println();
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}