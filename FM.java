import java.lang.*;
import java.util.*;

public class FM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int[][] matrix = new int[n][n];

            for(int x = 0; x<n; x++) {
                for(int y = 0; y<n; y++) {
                    matrix[x][y] = sc.nextInt(); 
                }
            }
            System.out.print("#" + (i+1) + " ");
            fm(matrix, n, m, k);
            System.out.println();
        }
    }

    private static void fm(int[][] matrix, int n, int m, int k) {
        int[][] tmp = new int[n-m+1][n-m+1];
        for(int i = 0; i<n-m+1; i++) {
            for(int j = 0;j<n-m+1; j++) {
                int tmps = 0;
                for(int x = i; x<m+i; x++) {
                    for(int y = j; y<m+j; y++) {
                        tmps+=matrix[x][y];
                    }
                }
                tmp[i][j] = tmps;
            }
        }

        int min = Integer.MAX_VALUE;
        int minx = 0;
        int miny = 0;

        for(int i = 0; i<n-m+1; i++) {
            for(int j = 0; j<n-m+1; j++) {
                int diff = (int)Math.abs(tmp[i][j]-k);

                if((diff < min) || (diff == min && ((i+j) < (minx+miny))) || (diff==min && (i+j)==(minx+miny) && i<minx)) {
                    min = diff;
                    minx = i;
                    miny = j;
                }
            }
        }
        System.out.print(minx + " " + miny);
    }
}

