// https://www.geeksforgeeks.org/problems/aggressive-cows/1

class cows {
    public static int aggressiveCows(int[] stalls, int k) {
        int n = stalls.length;

        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[n - 1] - stalls[0];
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canWePlace(stalls, mid, k)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    static boolean canWePlace(int[] stalls, int dist, int cows) {
        int countCows = 1;
        int last = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - last >= dist) {
                countCows++;
                last = stalls[i];
                if (countCows == cows) {
                    return true;
                }
            }
        }

        return false;
    }
}
