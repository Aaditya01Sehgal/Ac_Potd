// https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/submissions/1509687868/
class Pair {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }
}