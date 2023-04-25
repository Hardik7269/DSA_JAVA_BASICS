public class Quicksort{
    public static void quicksort(int start ,int end , int a[]){
        int pivot = a.length - 1;

        while (start <= end && end <= pivot ){
            if(a[end] > a[pivot] ){
                end++;
            }else{
                start++;
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                end++;
            }
        }
            int temp = a[start + 1];
            a[start+1] = a[pivot];
            a[pivot] = temp;
            pivot = start+1;

            quicksort(0, 0, a);
            // quicksort(pivot, pivot+1, a);
        printArray(a);
        
    }

    public static void printArray(int a[]){
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i]+",");
        }
    }

    public static void main(String[] args) {
        int a [] = {6,3,9,8,2,5};
        quicksort(0, 0, a);
    }
}