public class sorting{

    public static void printArray(int a[]){
        for(int i = 0 ; i< a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void selectionSort(int a[]) {
        for(int i = 0 ; i < a.length -1 ; i++){
            int min = i;
            for(int j = i + 1 ; j < a.length ; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i]; 
            a[i] = temp;
        }
        printArray(a);
    }

    public static void bubbleSort(int a[]){
        boolean swap = false;
        for(int i = 0 ; i < a.length - 1 ; i++){
            if(swap == false){// something is wrong here
                System.out.println("O(n) complexity");
                break;
            }
            for(int j = 0  ; j < a.length - i - 1 ; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1] ; 
                    a[j+1] = temp;
                    swap = true;
                }
            }
        }
        printArray(a);
    }

    public static void insertionSort(int a[]){

        for(int i = 1 ; i < a.length ; i++){
            int temp = a[i];
            int j = i-1;

            while(j>=0 && a[j] > temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
        printArray(a);
    }

    public static void countingSort(int a[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < a.length ; i++){
            max = Math.max(max, a[i]);
        }
        int b[]=new int [max+1];
        for(int i = 0 ; i<a.length ; i++){
            int pos = a[i];
            b[pos] += 1; 
        }
        int count = 0;
        for(int i = 0 ; i <b.length ; i++){
            if(b[i] != 0){
                for(int j = b[i] ; j>0 ; j--){
                    a[count] = i ;
                    b[i]--;
                    count ++;
                }
            }
        }
        printArray(a);
    }
    public static void main(String[] args) {
        int a[] = {5,4,1,2,3};
        // selection_sort(a);
        // bubbleSort(a);
        insertionSort(a);
        // int a[] = {1,1,5,3,4,4,3};
        // countingSort(a);
    }
}