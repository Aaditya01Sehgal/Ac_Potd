import java.util.Scanner;

public class Longlong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Length of the array
            long[] array = new long[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextLong();
            }

            long maxSum = 0;
            int operations = 0;
            boolean negativeBlock = false;

            for (int i = 0; i < n; i++) {
                maxSum += Math.abs(array[i]);
                if (array[i] < 0 && !negativeBlock) {
                    operations++;
                    negativeBlock = true;
                } else if (array[i] > 0) {
                    negativeBlock = false;
                }
            }

            System.out.println(maxSum + " " + operations);
        }
        
        scanner.close();
    }
}
