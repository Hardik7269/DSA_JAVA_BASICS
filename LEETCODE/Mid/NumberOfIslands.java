class NumberOfIslands{
    public static void main(String[] args) {
        int[][] grid = {{1,1,1,1,1},
                        {0,0,1,0,0},
                        {1,1,1,1,1},
                        {0,0,0,0,0}};
        boolean isLeft = false;
        boolean isUp = false;
        boolean isRight = false;
        int noOfIsland = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                isLeft = false;
                isUp = false;
                isRight = false;
                int curr = grid[i][j];
                if(grid[i][j] == 1){

                    //check left
                    if(j > 0 && grid[i][j-1] == 1){
                        isLeft = true;
                    }

                    //check up
                    if(i >0 && grid[i-1][j] == 1){
                        isUp = true;
                    }

                     //check Right
                    if(i != 0 && j < grid[i].length-1 && grid[i][j+1] == 1){
                        isRight = true;
                    }

                    if(!(isLeft || isUp || isRight)){
                        noOfIsland++;
                    }
                }
            }
        }
        System.out.println(noOfIsland);
    }
}