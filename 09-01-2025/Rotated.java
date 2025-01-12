
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/submissions/1502680694/
class Rotated {
    public int findMin(int[] nums) {
       Arrays.sort(nums);
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        
        return min;
    }
}