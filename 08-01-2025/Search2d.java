// https://leetcode.com/problems/search-a-2d-matrix/description/
class Search2d {
    public boolean searchMatrix(int[][] matrix, int target) {
        int first = matrix.length;
        int last = matrix[0].length;

        int start = 0;
        int end = (first * last) - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int row = mid / last;
            int col = mid % last;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}