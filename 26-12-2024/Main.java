import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    //   https://cses.fi/problemset/task/1618
        int n = scanner.nextInt();
        scanner.close();

       

        
        System.out.println(countTrailingZeros(n));
    }

    private static int countTrailingZeros(int n) {
        int count = 0;
        for (long i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }

        return count;
    }
}
