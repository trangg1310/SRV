import java.lang.*;
import java.util.*;

public class NUMPER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i< t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.print("#" + (i+1) + " ");
            numper(a, b);
            System.out.println();
        }
    }

    private static void numper(int a, int b) {
        int a1 = (int)Math.sqrt(a);
        int b1 = (int)Math.sqrt(b);

        if(a1==b1 && b1*b1 < b && a1*a1 < a) {
            System.out.print("NO NUMBER");
        } else {
            if(a1*a1 < a) {
                a1++;
            }
            for(int i = a1; i<=b1; i++) {
                System.out.print(i*i + " ");
            }
        }
    }
}
