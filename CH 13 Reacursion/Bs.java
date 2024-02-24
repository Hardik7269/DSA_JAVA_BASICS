class Bs{
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5};
        int target = 0;
        bs(arr, target, 0, arr.length-1);
    }
    static int bs(int []arr , int target , int s , int e){
        int mid = (s+e)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(target < arr[mid]){
            return bs(arr , target , s , mid);
        }
         
        else if (target > arr[mid]){
            return bs(arr , target , mid+1 , e);
        }

        return -1;
    }
}