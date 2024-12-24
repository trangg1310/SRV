import java.lang.*;
import java.util.*;

public class BTFNUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i<t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            Set<Integer> beauty = new HashSet<>();
            for(int j = 0; j< n; j++) {
                beauty.add(sc.nextInt());
            }
            int x = sc.nextInt();
            int y = sc.nextInt();

            int res = 0;
            for(int j = x;j<=y; j++) {
                if(btf(j, beauty, m)) {
                    res++;
                }
            }

            System.out.println("#" + (i+1) + " " + res);
        }
    }    

    private static boolean btf(int number, Set<Integer> beauty, int m) {
        int count = 0;
        while (number >0) {
            int digit = number%10;
            if(beauty.contains(digit)) count++;
            if(count >= m) return true;
            number = number/10;
        }
        return false;
    }
}
