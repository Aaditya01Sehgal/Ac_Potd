// https://leetcode.com/problems/happy-number/

class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer> hp = new HashSet<>();
       
       while ( n != 1 && !hp.contains(n)){
        hp.add(n);
        n = square(n);
       }
        return n==1;
        
    }
    public int square(int n ){
        int ans = 0;
        while ( n > 0){
            int rem = n % 10;
            n /=10;
            ans  += rem * rem;
        }
        return ans;
    }
}