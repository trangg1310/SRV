import java.lang.*;
import java.util.*;

public class ABSYSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<t; i++) {
            sc.nextLine();
            String[] s = sc.nextLine().split(" ");
            int a = 0;
            int b = 0;
            int c = 0;
            int checka = 0;
            for(int j = 0; j<s.length; j+=2) {
                if(check(s[j]) && s[j]!="") {
                    if(j==0)
                        a = Integer.parseInt(s[j]);
                    if(j==2) 
                        b = Integer.parseInt(s[j]);
                    if(j==4)
                        c = Integer.parseInt(s[j]);
                } else {
                    if(j == 0 || j == 2) {
                        checka = 1;
                    }
                }
            }
            if(checka==1) {
                if(a != 0) {
                    b = c-a;
                } else {
                    a = c-b;
                }
            } else {
                c = a + b;
            }
            System.out.println(a+ " + " + b + " = " + c );
        }
    }

    private static boolean check (String s) {
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i)=='m') return false;
        }
        return true;
    }
}
