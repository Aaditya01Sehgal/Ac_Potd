// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/

// class Solution {
//     public boolean search(int[] nums, int target) {
//         int left = 0, right = nums.length - 1;
        
//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             if (nums[mid] == target) {
//                 return true;
//             }

//             if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
//                 left++;
//                 right--;
//             } 
//             else if (nums[left] <= nums[mid]) {
//                 if (nums[left] <= target && target < nums[mid]) {
//                     right = mid - 1;
//                 } else {
//                     left = mid + 1;
//                 }
//             } 
//             else {
    
//                 if (nums[mid] < target && target <= nums[right]) {
//                     left = mid + 1;
//                 } else {
//                     right = mid - 1;
//                 }
//             }
//         }
        
//         return false;
//     }
// }


// class Solution {
//     public boolean search(int[] nums, int target) {

//         Arrays.sort(nums);

//         int start = 0;
//         int end =  nums.length-1;

//         while ( start <= end){
//             int mid = start + ( end - start)/2;

//             if ( nums[mid]== target){
//                 return true;
//             } else if ( nums[mid] < target){
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }
//         return false;
//     }
//  }