class Distance {
    public static double findSmallestMaxDist(int[] stations, int k) {
        double start = 0, end = 1e9, ans = 0;
        while ((end - start) > 0.0001) {
            double mid = start + (end - start) / 2;
            
            if (isValid(stations, k, mid)) {
                ans = mid;
                end = mid;
            } else {
                start = mid;
            }
        }
        return ans;
    }
    
    private static boolean isValid(int[] stations, int k, double d) {
        int requiredStations = 0;
        for (int i = 1; i < stations.length; i++) {
            double distance = stations[i] - stations[i - 1];
            requiredStations += Math.ceil(distance / d) - 1;
        }
        return requiredStations <= k;
    }
}