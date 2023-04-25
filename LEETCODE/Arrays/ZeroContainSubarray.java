class ZeroContainSubarray{
    static int count = 0;

    public static void printArray(int subary[]){
        for(int i = 0 ; i < subary.length ; i++){
            System.out.print(subary[i]);
        }
    }

    public static void zeroSubarrays(int nums [], int subary [] , int idx){
        if(idx == subary.length  -1){
            count++;
            return;
        }
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < subary.length  ; j ++){
                for(int k = i ; k < j ; k++){
                    subary[idx] = nums[k];
                }
                printArray(subary);
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int countt = 0;
        int nums [] = {0,0,0,2,0,0};
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]==0){
                countt++;
            }
        }
        int subary[] = new int [countt]; 
        zeroSubarrays(nums , subary , 0);
           
        System.out.println(count +" ,"); 
    }
}