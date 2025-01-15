//https://www.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1

//class rowsort {
//     public static int median(int matrix[][], int r, int c) {
//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;

//         for (int i = 0; i < r; i++) {
//             min = Math.min(min, matrix[i][0]);
//             max = Math.max(max, matrix[i][c - 1]);
//         }

//         int desired = (r * c + 1) / 2;

//         while (min < max) {
//             int mid = min + (max - min) / 2;
//             int place = 0;

//             for (int i = 0; i < r; i++) {
//                 place += Arrays.binarySearch(matrix[i], mid) + 1;
//             }

//             if (place < desired) {
//                 min = mid + 1;
//             } else {
//                 max = mid;
//             }
//         }

//         return min;
//     }
// }


class rowsort {
    int median(int mat[][]) {
        
        // Bruate Force Approach
        
        // ArrayList<Integer> ans = new ArrayList<>();
         int m = mat.length;
         int n = mat[0].length;
        
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         ans.add(mat[i][j]);
        //     }
        // }
        
      
        // Collections.sort(ans);
        
        // return ans.get((m * n) / 2);

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            low = Math.min(low, mat[i][0]);
            high = Math.max(high, mat[i][n - 1]);
        }

        int req = (m * n) / 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int small = count(mat, m, n, mid);
            if (small <= req) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    static int count(int[][] matrix, int m, int n, int x) {
        int count = 0;
        for (int i = 0; i < m; i++) {
            count += upperBound(matrix[i], x, n);
        }
        return count;
    }

    static int upperBound(int[] row, int x, int n) {
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (row[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}







