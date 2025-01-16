// https://leetcode.com/problems/merge-sorted-array/description/
class merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m -1;
        int b = n-1;
        int c = nums1.length - 1;

        while ( c >= 0){
            int ele1, ele2;
          ele1 = ( a >= 0) ? nums1[a] : Integer.MIN_VALUE;
           ele2 = ( b >= 0) ? nums2[b] : Integer.MIN_VALUE;

            if ( ele1 > ele2){
                nums1[c] = ele1;
                c--;
                a--;
            } else {
                nums1[c] = ele2;
                c--;
                b--;
            }
        }
    }
}