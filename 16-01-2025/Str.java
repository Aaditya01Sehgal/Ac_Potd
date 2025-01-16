// https://leetcode.com/problems/string-compression/description/
class Str {
    public int compress(char[] chars) {
        int n = chars.length;
        int index = 0;
        
        for (int i = 0; i < n; i++) {
            char currentChar = chars[i];
            int count = 0;
            
            while (i < n && chars[i] == currentChar) {
                count++;
                i++;
            }
            i--;
            
            chars[index++] = currentChar;
            
            if (count > 1) {
                String Str = Integer.toString(count);
                for (char c : Str.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        
        return index;
    }
}