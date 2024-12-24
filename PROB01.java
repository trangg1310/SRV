import java.lang.*;
import java.util.*;


public class PROB01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i<t; i++) {
            int x = sc.nextInt();
            int res = probo(x);
            System.out.println("#" + (i+1) +" "+res);
        }
    }

    private static int probo(int x) {
        int count = 0;
        int res = 0;
        while(count==0 || res/10 > 0) {
            res = 0;
            while(x > 0) {
                res += x%10;
                x = x/10;
            }
            count++;
            x = res;            
        }
        return res;
    }
}
