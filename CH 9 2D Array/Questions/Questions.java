public class Questions{
    
    public static void que1(int a[][]){
        int count = 0;
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j<a[0].length ; j++){
                if(a[i][j] == 7){
                    count ++;
                }
            }
        }
        System.out.println("number of 7 is : " + count);
    }
    public static void que2(int a[][]){
        int i = 1, j = 0;
        int sum = 0;
        while(j < a[0].length){
            sum += a[i][j];
            j++;
        }
        System.out.println("Sum of 2nd row is :" + sum);
    }
    public static void transponse(int a[][]){
        int b [][]= new int [a[0].length][a.length];
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j<a[0].length ; j++){
                b[j][i] = a[i][j];
            }
        }
        pirntArray(b);
    }
    public static void pirntArray(int b[][]){
        for(int i = 0 ; i < b.length ; i++){
            for(int j = 0 ; j < b[0].length ; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      int a[][] = {{4,7,8},{7,7,9}};  
    //   que1(a);
    //   que2(a);
        transponse(a);
    }
}