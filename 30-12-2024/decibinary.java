
    class Solution {
        public int minPartitions(String n) {
            int lar = 0;
            for ( int i = 0; i<n.length(); i++){
                lar = Math.max( lar, n.charAt(i)- '0');
            }
            return lar;
        }
    }

