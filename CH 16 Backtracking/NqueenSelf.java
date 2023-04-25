public class NqueenSelf{
        static int  count = 0;
        public static boolean isValid(char board[][],int row , int col){
        //for up row(your col will be the same)
        for(int i = row ; i >= 0 ; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //for diagonal of right side
        for(int i=row-1, j=col+1 ; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //for diagonal of left side
        for(int i = row-1 , j = col-1; i>=0 && j>=0 ; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
        }

    public static void nqueenbord(char board[][], int row){
        if(row == board.length) {
            count++;
            // printBoard(board);
            return;
        }
        
            for(int j = 0 ; j < board.length ; j++){
                if(isValid(board, row, j)){
                board[row][j] = 'Q';
                nqueenbord(board, row+1);
                board[row][j]= '.';
            }
        }
    }

    public static void printBoard(char board[][]){
        
        System.out.println("--------Chess Board-------");

            for(int i = 0 ; i < board.length ; i++){
                for(int j = 0 ; j < board.length ; j++){
                    System.out.print(board[i][j]+ " ");
                }
                System.out.println();
            }
    
    }
    
    public static void main(String args[]){
        int n = 5;
        char board[][] = new char [n][n];
        for(int i = 0 ; i<board.length ; i++){
            for(int j = 0 ; j<board.length; j++){
                board[i][j] = '.';
            }
        }
            
        
        nqueenbord(board, 0);
        System.out.println("Number of ways are : " + count);
    }
}