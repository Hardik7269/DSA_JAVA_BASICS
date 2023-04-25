import java.util.*;
public class searching{

    public static String menueString(String menue[], String key){
        for(int i = 0 ; i<menue.length ; i++){
            if(key == menue[i]){
                return key;
            }
        }
        return "not found";
    }

    public static int linearsearch(int key){
        // int arr[] = new int[10];
        int arr[] = {1,2,5,8,9,6,36,547,8,10};
        
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] == key){
                System.out.println("key found at index : "+i);
                return 1;
            }
        }
        System.out.println("key is not in array");
        return 0;
    }
    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0 ; i<arr.length ; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static int getSmallest(int arr[]){
        int smalleset = Integer.MAX_VALUE;
        for(int i = 0 ; i<arr.length ; i++){
            if(smalleset > arr[i]){
                smalleset = arr[i];
            }
        }
        return smalleset;
    }
    
    public static int binarySearch(int arr[], int key){
        int start = 0, end = arr.length;

        while(start <= end){
            int mid = (start + end) / 2;
            if(mid == key){
                return key;
            }
            else if(key > mid){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void revarray(int a[]){
        int low = 0 , high = a.length-1;
        int temp;
        while(low < high){
            temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low ++;
            high--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,5,8,9,6,36,547,8,10};
        int a[] = {1,2,5,8,9,6,36,547,8,10};
        String menue[] = {"Samosa" , "Chole" , "Bhel" , "Tea"};

        // System.out.println(menueString(menue, "Samosa"));
        // System.out.println("Largest value is : "+getLargest(arr));
        // System.out.println("Smallest value is : "+getSmallest(arr));
        // linearsearch(10);
        // System.out.println(binarySearch(arr, 65));
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i]+",");
        }
        System.out.println();
        revarray(a);
        System.out.println("reversed array : ");
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(+a[i]+",");
        }
        
    }
}