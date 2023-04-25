class SpiralMatrix{
    public static void spiralMatrix(int a[][]){
        int firstRow = 0 , firstCol = 0;
        int endRow = a.length -1 ;
        int endCol = a[0].length - 1;

        while(firstRow <= endRow && firstCol <= endCol){
            for(int i = firstCol ; i <= endCol ; i++){
                System.out.print(a[firstRow][i] + ", ");
            }
            for(int i = firstRow + 1 ; i <= endRow ; i++){
                System.out.print(a[i][endCol]+ ", ");
            }
            for(int i = endCol - 1 ; i >= firstCol ; i--){
                System.out.print(a[endRow][i] + ", ");
            }
            for(int i = endRow - 1 ; i >= firstRow+1 ; i--){
                System.out.print(a[i][firstCol]+ ", ");
            }
            firstCol++;
            firstRow++;
            endCol--;
            endRow--;
        }
    }
    public static void pirntArray(int a[][]){
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[0].length ; j++){
                System.out.println(a[i][j] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int a[][] = {{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12}};

        spiralMatrix(a);
    }
}