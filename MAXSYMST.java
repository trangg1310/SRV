import java.lang.*;
import java.util.*;

public class MAXSYMST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<t; i++) {
            String s = sc.nextLine();
            int res = maxsymst(s);
            System.out.println("#" + (i+1) + " " + res);
        }
    }

    private static int maxsymst(String s) {
        int max = 0;

        for(int i = 0; i<s.length(); i++) {
            int max1 = maxs(s, i, i);
            int max2 = maxs(s, i, i+1);
            if(max1 >= max2 && max1 > max) {
                max = max1;
            } else 
            if(max2 > max1 && max2 > max) {
                max = max2;
            }
        }

        return max;
    }

    private static int maxs(String s, int left, int right) {
        while (left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
}