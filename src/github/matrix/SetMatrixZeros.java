package github.matrix;

import java.util.Arrays;

public class SetMatrixZeros {

//    73. Set Matrix Zeroes
    public static void main(String[] args) {

      int[][] matrix =  {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
      setZeroes(matrix);

      for (int i = 0 ; i< matrix.length ; i++){
          for (int j = 0 ; j < matrix[0].length ; j++){
              System.out.print(matrix[i][j]+" ");
          }
          System.out.println();
      }


    }

    public static void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int[] row = new int[m];
        int[] col = new int[n];

        Arrays.fill(row,0);
        Arrays.fill(col,0);
        for (int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                if (matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0 ;i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                if (row[i] == 1 || col[j]== 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
