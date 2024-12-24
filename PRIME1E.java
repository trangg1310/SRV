import java.lang.*;
import java.util.*;

public class PRIME1E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        for(int i = 0; i< t; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            
            generPrime(m, n);
            System.out.println();
        }
    }

    private static boolean isPrime(int x) {
        if(x <= 1) return false;
        for(int i = 2; i<=Math.sqrt(x); i++) {
            if(x%i==0) return false;
        }
        return true;
    }

    private static void generPrime(int m, int n) {
        while (m<=n) {
            if(isPrime(m)) {
                System.out.println(m);
            }
            m++;
        }
    }
}
