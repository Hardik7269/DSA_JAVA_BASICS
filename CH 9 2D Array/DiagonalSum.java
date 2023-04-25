public class DiagonalSum{
    public static int diagonalsum(int a[][]){
        int sum = 0;
       for(int i = 0 ; i<a.length ; i++){
        //for 1st diagonal
        sum+= a[i][i];
        // for 2nd diagonal
        if(i != a.length - 1 - i)// for odd number of length
            sum+= a[i][a.length - 1- i];
       }
        return sum;
    }
    public static void main(String[] args) {
        int a[][] = {{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};

        System.out.println(diagonalsum(a));
    }
}