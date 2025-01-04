import java.util.Scanner;

public class sub {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            long ones = 0, zeroes = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    zeroes++;
                } else if (arr[i] == 1) {
                    ones++;
                }
            }

            long ans = ones * (long)Math.pow(2, zeroes);
            System.out.println(ans);
        }
    }
}
