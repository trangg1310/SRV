import java.lang.*;
import java.util.*;

public class PROBO2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<t; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            sc.nextLine();
            char[][] bulding = new char[5*m + 1][5*n + 1];
            for(int j = 0; j<(5*m+1); j++) {
                String line = sc.nextLine();
                bulding[j] = line.toCharArray();
            }
            System.out.print("#" + (i+1) + " ");
            probo(bulding, m, n);
            System.out.println();
        }
    }

    private static void probo(char[][] building, int m, int n) {
        int[] res = new int[5];
        for(int i = 0; i<m; i++) {
            for(int j = 0; j<n; j++) {
                if(building[5*i+4][5*j+1]=='*') {
                    res[4]++;
                } else if(building[5*i+3][5*j+1]=='*') {
                    res[3]++;
                } else if(building[5*i+2][5*j+1]=='*') {
                    res[2]++;
                } else if(building[5*i+1][5*j+1]=='*') {
                    res[1]++;
                } else {
                    res[0]++;
                }
            }
        }

        for(int i = 0; i<5; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
