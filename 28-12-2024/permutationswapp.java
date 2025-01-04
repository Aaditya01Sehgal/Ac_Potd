import java.util.Scanner;

public class permutationswapp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            int ans = 0;
            for (int i = 1; i < n; i++) {
                ans = gcd(Math.abs(a[i] - (i + 1)), ans);
            }

            System.out.println(ans);
        }
    }

    public static int gcd(int a, int b) {
        if ( a == 0){
            return b;
        }
        if ( b== 0){
            return a;
        }
        if ( a ==b){
            return a;
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
