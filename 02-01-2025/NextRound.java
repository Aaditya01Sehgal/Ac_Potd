import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int ans = 0;
        int tp = a[k - 1];

        for (int i = 0; i < n; i++) {
            if (a[i] >= tp && a[i] > 0) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}

/*
 8 5
10 9 8 7 7 7 5 5
4
 */