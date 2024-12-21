
// Question 2 : https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
// 21/12/2024

class Solution {
    public static int gcd(int a, int b){

        while ( b != 0){
            if ( a == 1 && b == 1){
                return 1;
            }
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}