import.java.util.Scanner;

public class NewYear{
    public static void main(Strig[] args){
        Scanner in = new Scanner(System.in);
// https://codeforces.com/problemset/problem/750/A

        int n = in.nextInt();
        int k = in.nextInt();
        int time = 240 - k;
        int count = 0;
        int i = 1;
        while ( i <= n){
            time -= 5*i;
            if ( time >= 0){
                count++;
            }
            i++;
        }
        System.out.println(count);
    }

}