public class prefixarray{
    public static void Subarray_maxSum_using_prefixArray(int a[]){
        int prefix[] = new int[a.length];
        int currSum = 0,maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i < a.length ; i++){
            prefix[i] = i == 0 ? a[i] :prefix[i-1] + a[i];
        }

       for(int i = 0 ; i < a.length ; i++){
            for(int j = i ; j< a.length ; j ++){
                currSum = i == 0 ? prefix[i] : prefix[j] - prefix[i-1] ;
                if(maxSum < currSum){
                    maxSum = currSum;
                } 
            }
        }
        System.out.println("max Sum = " + maxSum);

    }

    public static void kadanes(int a[]){//if there is all negetive int in array then it'll return only zero .. so use special case for that and find the smallest -ve value
        int currSum= 0 , maxSum = Integer.MIN_VALUE; 
        for(int i = 0 ; i < a.length ; i++){
            currSum = currSum + a[i];
            if(currSum < 0){
                currSum = 0;
            }
            // if(maxSum < currSum){
            //     maxSum = currSum;
            // }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Sum of max subarray is : "+maxSum);
    }

    public static void main(String[] args) {
        int a[] = {-2,-3,4,-1,-2,1,5,-3};
        // Subarray_maxSum_using_prefixArray(a);
        kadanes(a);
    }
}