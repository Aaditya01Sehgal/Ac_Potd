import java.util.Scanner;

public class onePrime{
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (countDistinctPrimeFactors(i) == 2) {
                count++;
            }
        }
        
        System.out.println(count);
    }
    
    private static int countDistinctPrimeFactors(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && isPrime(i)) {
                count++;
            }
        }
        return count;
    }
    
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

