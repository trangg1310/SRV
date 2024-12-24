import java.lang.*;
import java.util.*;

public class FNDSTR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<1; i++) {
            int t = sc.nextInt();
            sc.nextLine();
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int res = fndstr(s1, s2);
            System.out.println("#" + t + " " + res);
        }
    }

    private static int fndstr(String s1, String s2) {
        int i = 0;
        int count = 0;
        while (i<s2.length()-s1.length()+1) {
            int j = 0;
            while (j<s1.length() && s1.charAt(j)==s2.charAt(i+j)) {
                j++;
            }
            if(j == s1.length()) count++;
            i++;
        }
        return count;
    }
}
