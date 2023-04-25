import java.util.*;

class SpiralMatrix{
    public List<Integer> spiralOrder(int[][] matrix) {
        int sr = 0 , sc = 0 , er = matrix.length-1 , ec = matrix[0].length-1 ;
  List<Integer> list = new ArrayList<>();
  while(sr <= er && sc <= ec){
      for(int i = sc ; i <= ec ; i++ ){
          list.add(matrix[sr][i]);
      }
      for(int i = sr+1 ; i <= er ; i++ ){
          list.add(matrix[i][ec]);
      }
      for(int i = ec-1 ; i >= sc ; i-- ){
          list.add(matrix[er][i]);
      }
      for(int i = er-1 ; i >= sr+1 ; i-- ){
          list.add(matrix[i][sc]);
      }
      sr++;sc++;
      er--;ec--;
  }
  return list;
}
    public static void main(String[] args) {
        int matrix [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{8,9,6,3}};
        System.out.println(spiralOrder(matrix));
    }
}