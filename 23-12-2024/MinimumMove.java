public class MinimumMove {
    public static void main(String[] args) {

    }
//    Question 2 : https://leetcode.com/problems/minimum-moves-to-convert-string/description/
class Solution {
    public int minimumMoves(String s) {
        int min = 0;
        int  i = 0;
        while ( i< s.length()){
            if (s.charAt(i) == 'X'){
                min++;
                i +=3;
            }else {
                i +=1;
            }
        }
        return min;
    }
}
}
