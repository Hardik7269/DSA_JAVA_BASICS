import java.util.Arrays;

class MinFallingPath{

 
    static int min = Integer.MAX_VALUE;
    static int index = -1;
    public static void main(String[] args) {
        int[][] grid={{-73,61,43,-48,-36},{3,30,27,57,10},{96,-76,84,59,-15},{5,-49,76,31,-7},{97,91,61,-46,67}};
        int n = grid.length;
        int[][] dp = new int[n][n];

        // Initialize the first row of dp with the values from the first row of the grid
        for (int j = 0; j < n; j++) {
            dp[0][j] = grid[0][j];
        }
        System.out.println(Arrays.toString(dp[0]));
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Find the minimum value from the previous row that is not in the same column as j
                int minPrev = Integer.MAX_VALUE;
                for (int k = 0; k < n; k++) {
                    if (k != j) {
                        minPrev = Math.min(minPrev, dp[i - 1][k]);
                    }
                }
                System.out.print("minPrev " + minPrev);
                System.out.print(" - grid[i] " + grid[i][j]);
                dp[i][j] = grid[i][j] + minPrev;
                System.out.println();
            }
            System.out.println(Arrays.toString(dp[i]));
            System.out.println("************");
        }
    }

}