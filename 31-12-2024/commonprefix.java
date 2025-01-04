// 
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for ( int i = 1; i<strs.length; i++){
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

/* class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String a = strs[0];
        String b = strs[strs.length -1];

        int i = 0;

        while ( i < a.length()){
            if (a.charAt(i) == b.charAt(i)){
                i++;
            } else {
                break;
            }
        }
        if ( i == 0){
            return "";
        } else {
            return a.substring(0,i);
        }
    }
} */