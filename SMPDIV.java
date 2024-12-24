import java.util.*;
import java.lang.*;


public class SMPDIV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i<t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

           div(n, x, y);
           System.out.println();
           
        }
        
    }

    private static void div(int n, int x, int y) {
        int tmp = 2;
        while (tmp < n) {
            if(tmp%x==0 && tmp%y!=0) {
                System.out.print(tmp + " ");

            }
            tmp++;
        }
    }
}
