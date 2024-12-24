import java.lang.*;
import java.util.*;

public class CNTSYMST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<t; i++) {
            String s = sc.nextLine();
            int res = cntsymst(s);
            System.out.println("#" + (i+1) + " " + res);
        }
    }

    private static int cntsymst(String s) {
        int n = s.length();

        int count = 0;
        for(int i = 0; i<n; i++) {
            count+= countfromi(s, i, i);
            count+=countfromi(s, i, i+1);
        }
        
        return count;
    }

    private static int countfromi(String s, int left, int right) {
        int count = 0;

        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
}
