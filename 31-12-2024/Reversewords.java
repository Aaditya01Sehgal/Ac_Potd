class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        String res = "";
        for ( int i = arr.length-1; i>= 0; i--){
            if ( arr[i].length() == 0){
                continue;
            }
            if ( res.length() == 0){
                res += arr[i];
            } else {
                res += " " + arr[i];
            }
        }
            return res;
    } 
}