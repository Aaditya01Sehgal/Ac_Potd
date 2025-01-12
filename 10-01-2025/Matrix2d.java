// https://leetcode.com/problems/search-a-2d-matrix-ii/description/
class Matrix2d {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = matrix.length;
        int end = matrix[0].length;
        int row = 0;
        int col = end -1;

         while (row < start && col >= 0){
          if (matrix[row][col] == target){
            return true;
          } else if ( matrix[row][col] > target){
            col--;
          } else{
           row++;
          } 
        } 
        return false;
    }
}