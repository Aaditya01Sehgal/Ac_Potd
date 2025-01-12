// https://leetcode.com/problems/koko-eating-bananas/description/

class koko {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = getMax(piles);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (eat(piles, h, mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private int getMax(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }
        return max;
    }

    private boolean eat(int[] piles, int h, int speed) {
        int total = 0;
        for (int pile : piles) {
            total += Math.ceil((double) pile / speed);
        }
        return total <= h;
    }
}