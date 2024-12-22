public class SingleNumber {
    public static void main(String[] args) {

    }
//    Question 1 : https://leetcode.com/problems/single-number/description/
    class Solution {
        public int singleNumber(int[] nums) {

            int value = 0;
            for (int i = 0; i<nums.length; i++){
                value = value^nums[i];
            }
            return value;
        }
    }
}
