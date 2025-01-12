//https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1
class Solution {

    static int findFloor(int[] arr, int k) {
        // write code here
        int start = 0;
        int end = arr.length;
        int floor = -1;
        
        while ( start <= end){
            int mid = start + ( end - start)/2;
            if (arr[mid]== k){
                return mid;
            } else if( arr[mid] < k){
                floor = mid;
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return floor;
    }
}
