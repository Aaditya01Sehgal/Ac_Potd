// https://www.geeksforgeeks.org/problems/find-nth-root-of-m5843/1


class nth {
    public int nthRoot(int n, int m) {
        if (m == 1) return n;
     

        int start = 1;
        int end = m;
        while (start <= end) {
            int mid = start + (end - start)/ 2;
            int pow = (int) Math.pow(mid, n);

            if (pow == m) {
                return mid;
            } else if (pow < m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; 
    }
}
