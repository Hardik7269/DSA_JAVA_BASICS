import java.util.ArrayList;

class PrimeSubstraction2601{

        public static boolean primeSubOperation(int[] nums) {
        int check = 0;
        //check that array is in increasing order or not 
        for(int h = 0 ; h < nums.length-1 ; h++){
            if(nums[h] < nums[h+1]){
                check ++;
            }
            if(check == nums.length-1){
                return true;
            }
        }
        int max = 0;
        ArrayList<Integer> prime = new ArrayList<>();

        // finding maximum number in array
        for(int i = 0 ; i < nums.length ; i++){
            max = Math.max(max,nums[i]);
        }
        // Arraylist for prime numbers
        for(int i = 2 ; i <= max ; i++){
            int isPrime = 0;
            for(int j = 1 ; j <= i ; j++){
                if(i % j == 0){
                    isPrime ++;
                }
            }
            if(isPrime == 2){
                prime.add(i);
            }
        }
        
        prime.add(max+1);
        System.out.println(prime);
        //creating array of substraction 
        
        for(int i = 0 ; i < nums.length ; i++){
            int idx = 0;
            for(int j = 0 ; j < prime.size() ; j++){
                if(nums[i] < prime.get(j)){
                    idx  = j -1;
                    break;
                }
            }

            nums[i] = nums[i] - prime.get(idx);
            //check that array is in increasing order or not 
            for(int h = 0 ; h < nums.length-1 ; h++){
                if(nums[h] < nums[h+1]){
                    return true;
                }
            }
        }
     return false;
    }

    public static void main(String[] args) {
        int nums [] = {6,8,11,1};
        System.out.println(primeSubOperation(nums));
    }
}