class Solution {
    // https://leetcode.com/problems/max-increase-to-keep-city-skyline/submissions/1495348803/?envType=problem-list-v2&envId=greedy
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
      int[] row = new int[n];
      int[] col = new int[n];

        for ( int i = 0; i<n; i++){
            for ( int j = 0; j<n; j++){
                row[i] = Math.max(row[i],grid[i][j]);
                col[j] = Math.max(col[j], grid[i][j]);
            }
        }
        int ops = 0;
        for ( int i = 0; i<n; i++){
            for ( int j = 0; j<n; j++){
                ops += Math.min(row[i],col[j]) - grid[i][j];
            }
        }
        return ops;
    }
}