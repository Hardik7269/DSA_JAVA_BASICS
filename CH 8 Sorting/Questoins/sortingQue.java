public class sortingQue{
    public static void printArray(int a[]){
        for(int i = 0 ; i< a.length ; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void rBubbleSort(int a[]){
        for(int i = 0 ; i<a.length-1 ; i++){
            for(int j = 0 ; j < a.length - i - 1 ; j++){
                if(a[j] < a[j+1]){
                    int temp =  a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        printArray(a);
    }
    public static void rSelectionSort(int a[]){
        
        for(int i = 0 ; i < a.length-1 ; i++){
            int min = i;
            for(int j = i+1 ; j < a.length ; j++){
                if(a[min] < a[j]){
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        printArray(a);
    }

    public static void rInsertionSort(int a[]){
        for(int i = 1 ; i < a.length ; i++){
            int temp = a[i];
            int j = i-1;
           while(j>=0 && a[j] < temp){
                a[j+1] = a[j];
                j--;
           }
           a[j+1] = temp;
        }
        for(int i = 0 ; i< a.length ; i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int a[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        // rBubbleSort(a);
        // rSelectionSort(a);
        rInsertionSort(a);
    }
}