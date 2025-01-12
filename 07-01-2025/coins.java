// https://leetcode.com/problems/arranging-coins/description/
class coins {
    public int arrangeCoins(int n) {
        int i = 1;

        while ( n > 0){
            i++;
            n = n-i;
        }
        return i-1;
    }
}