import java.lang.*;
import java.util.*;

public class SUMPROE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i<t; i++) {
            int n = sc.nextInt();
            sumofp(n);
        }
    }

    private static void sumofp(int n) {
        long sum = 0;
        for(int i = 1; i<=n; i++) {
            int x = n/i;
            sum += (x*i);
        }
        System.out.println(sum%1000007);
    }
}
