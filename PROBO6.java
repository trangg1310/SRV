import java.lang.*;
import java.util.*;

public class PROBO6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<t; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            sc.nextLine();
            char[][] d = new char[m][n];
            for(int j = 0; j<m; j++) {
                d[j] = sc.nextLine().toCharArray();
            }
            System.out.println("#"+(i+1)+" " + probo(d, m, n));
        }
    }

    private static int probo(char[][] d, int m, int n) {
        int[] dia = {-1, 0, 1, 0};
        int[] dja = {0, 1, 0, -1};

        int[] dib = {-2, -1, 0, 0, 1, 2, 0, 0};
        int[] djb = {0, 0, 1, 2, 0, 0, -1, -2};

        int[] dic = {-3, -2, -1, 0, 0, 0, 1, 2, 3, 0, 0, 0};
        int[] djc = {0, 0, 0, 1, 2, 3, 0, 0, 0, -1, -2, -3};

        for(int i = 0; i<m; i++) {
            for(int j = 0; j<n; j++) {
                if(d[i][j]=='A') {
                    for(int k = 0; k <4; k++) {
                        if(i+dia[k] >= 0 && i+dia[k] < m && j + dja[k] >=0 && j+dja[k]<n) {
                            if(d[i+dia[k]][j+dja[k]]=='H') {
                                d[i+dia[k]][j+dja[k]] = 'Y';
                            }
                        } 
                    }
                }
                if(d[i][j]=='B') {
                    for(int k = 0; k < 8; k++) {
                        if(i+dib[k] >= 0 && i+dib[k] < m && j + djb[k] >=0 && j+djb[k]<n) {
                            if(d[i+dib[k]][j+djb[k]]=='H') {
                                d[i+dib[k]][j+djb[k]] = 'Y';
                            }
                        } 
                    }
                }
                if(d[i][j]=='C') {
                    for(int k = 0; k <12; k++) {
                        if(i+dic[k] >= 0 && i+dic[k] < m && j + djc[k] >=0 && j+djc[k]<n) {
                            if(d[i+dic[k]][j+djc[k]]=='H') {
                                d[i+dic[k]][j+djc[k]] = 'Y';
                            }
                        } 
                    }
                }
            }
        }
        int count = 0;
        for(int i = 0; i<m; i++) {
            for(int j = 0; j<n; j++) {
                if(d[i][j]=='H') count++;
            }
        }
        return count;
    }
}