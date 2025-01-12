// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/

class capacity {
    public int shipWithinDays(int[] weights, int days) {
        int low = max(weights);
        int high = sum(weights);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int nod = func(weights, mid);
            if (nod <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public int max(int[] weights) {
        int maxi = 0;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > maxi) {
                maxi = weights[i];
            }
        }
        return maxi;
    }

    public int sum(int[] weights) {
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
        }
        return sum;
    }

    public int func(int[] weights, int cap) {
        int day = 1, load = 0;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] + load > cap) {
                day += 1;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return day;
    }
}