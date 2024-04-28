class MakeSquare{
    public static void main(String[] args) {
        char gird[][] = {{'B','W','B'},{'B','W','W',},{'B','W','B'}};

        int black = 0 ;
        int white = 0;
        for (int i = 0; i < gird.length - 1; i++) {
            for (int j = 0; j < gird.length - 1; j++) {
                if(grid[i][j] == 'B') black++;
                if(grid[i][j] == 'W')white++;
            }
        }
        if((white == 3 && black == 1 ) || white==1 && black==3) return true;

        white = 0;
        black = 0;
        for (int i = 0; i < gird.length - 1; i++) {
            for (int j = 1; j < gird.length - 1; j++) {
                if(grid[i][j] == 'B') black++;
                if(grid[i][j] == 'W')white++;
            }
        }
        if((white == 3 && black == 1 ) || white==1 && black==3) return true;

        white = 0;
        black = 0;
        for (int i = 1; i < gird.length - 1; i++) {
            for (int j = 0; j < gird.length - 1; j++) {
                if(grid[i][j] == 'B') black++;
                if(grid[i][j] == 'W')white++;
            }
        }
        if((white == 3 && black == 1 ) || white==1 && black==3) return true;
    }

    // public static boolen helperFun(char[][]arr , int i , int j ){
    //     if(i < 0 || i > arr.length-1 || j < 0 || j > arr.length-1 ){
    //         return 
    //     }
    // }
}