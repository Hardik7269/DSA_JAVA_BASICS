public class pairssubarray{
    public static void pairs(int a[]){
        for(int i = 0 ; i < a.length ; i++){
            for(int j = i+1 ; j < a.length ; j++){
                System.out.print("("+a[i]+","+a[j]+") ");
            }
            System.out.println();
        }   
    }
    public static int minvalue(int b[]){
        int smalleset = Integer.MAX_VALUE;
        for(int i = 0 ; i<b.length ; i++){
            if(smalleset > b[i]){
                smalleset = b[i];
            }
        }
        return smalleset;
    }

    public static int maxvalue(int b[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<b.length; i++){
            if(b[i] > max){
                max = b[i];
            }
        }
        return max;
    }

    public static void subarrays(int a[]){
        int count = 0, sum = 0;
        int size = (a.length*(a.length+1))/2;
        int b[] = new int[size];


        for(int i = 0 ; i <a.length ; i++){

            for(int j= i ; j< a.length; j++){

                for(int k = i ; k <= j ; k++){

                    System.out.print(a[k]+",");
                    sum = sum + a[k];
                }
                System.out.println("Sum : "+sum);
                b[count] = sum;
                count++ ;
                
                sum = 0;
            }System.out.println();
        }
        System.out.println("Total subarray is : "+ count);
        System.out.println("The min sum of subarray is : "+minvalue(b));
        System.out.println("The max sum of subarray is : "+maxvalue(b));
    }
    public static void main(String[] args) {
        int a[] = {1,-2,6,-1,3};
        // pairs(a);
        subarrays(a);
    }
}