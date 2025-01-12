//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.findPages(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class MinimumPage {
    public static int findPages(int[] arr, int k) {
        int n = arr.length;

        if (n < k) return -1;

        int low = max(arr);
        int high = sum(arr);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int nod = func(arr, mid);

            if (nod > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    static int func(int[] arr, int pages) {
        int student = 1, pageStudent = 0;

        for (int i = 0; i < arr.length; i++) {
            if (pageStudent + arr[i] <= pages) {
                pageStudent += arr[i];
            } else {
                student++;
                pageStudent = arr[i];
            }
        }
        return student;
    }

    public static int max(int[] arr) {
        int maxi = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        return maxi;
    }

    public static int sum(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
        }
        return ans;
    }
}
