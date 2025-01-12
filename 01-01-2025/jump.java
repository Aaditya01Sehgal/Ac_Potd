class Solution {
    // https://leetcode.com/problems/jump-game/submissions/1494271994/
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxindex = 0;
        for (int i = 0; i < n; i++) {
            if (i > maxindex) {
                return false;
            }
            maxindex = Math.max(maxindex, i + nums[i]);
        }
        return true;
    }
}