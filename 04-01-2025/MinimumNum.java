// https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/description/

class MinimumNum {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] res = new int[n];
        int ops = 0;
        int count = 0;

        for ( int i = 0; i<n; i++){
            res[i] += ops;
            count += boxes.charAt(i) -'0';
            ops += count;

        }

    ops = 0; count = 0;
 for ( int i = n-1; i >= 0; i--){
            res[i] += ops;
            count += boxes.charAt(i) -'0';
            ops += count;
 }
 return res;
    }
}