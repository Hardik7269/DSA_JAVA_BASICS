import java.util.*;

class MaxLandingField{
    public static void main(String[] args) {
        int[][] land = {{1,0,0},
                        {0,1,1},
                        {0,1,1}};

        int row = land.length;
        int col = land[0].length;
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(land[i][j] == 1){
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    int[] max = {i ,j};
                    dfs(i,j,land,temp , max);
                    temp.add(max[0]);
                    temp.add(max[1]);
                    list.add(temp);
                }
            }
        }
        int res[][] = new int[list.size()][4];
        for(ArrayList<Integer> ls : list){
            System.out.println(ls);    
        }
        // for (int i = 0; i < res.length; i++) {
        //     ArrayList<Integer> innerList = list.remove(0);
        //     for (int j = 0; j < res[i].length; j++) {
        //         res[i][j] = innerList.get(j);
        //     }
        // }
        // for(int[] arr : res){
        //     System.out.println(Arrays.toString(arr));
            
        // }    
    }

    public static void dfs(int i, int j, int[][] land, ArrayList<Integer> list, int[] max) {
        if (i < 0 || j < 0 || i >= land.length || j >= land[0].length || land[i][j] != 1) {
            return;
        }

        max[0] = Math.max(max[0], i);
        max[1] = Math.max(max[1], j);

        land[i][j] = 0;
        // System.out.println("[ "+i +", " + j +" ]");
        dfs(i, j+1, land, list, max);
        dfs(i+1, j, land, list, max);
        dfs(i, j-1, land, list, max);
        dfs(i-1, j, land, list, max); 
    }
}