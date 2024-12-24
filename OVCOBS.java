import java.lang.*;
import java.util.*;

public class OVCOBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[][] matrix = new int[n][n];
            for(int j = 0; j<n; j++) {
                for(int k = 0; k<n; k++) {
                    matrix[j][k] = sc.nextInt();
                }
            }

            int res = ovcobs(matrix, n, x, y);

            System.out.println("#" + (i+1) + " "+ res);
        }
    }

    private static int ovcobs(int[][] matrix, int n, int x, int y) {
        int res = 0;
        int[] di = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] dj = {-1, 0, 1, 1, 1, 0, -1, -1};
        while(true) {
            int[] tmp = new int[8];
            int[] tmpdx = new int[8];
            int[] tmpdy = new int[8];
            for(int i = 0; i<8; i++) {
                int dx = di[i] + x;
                int dy = dj[i] + y;
                if(dx >= 0 && dx < n && dy >= 0 && dy < n) {
                    // System.out.println("check matrix[dx][dy]: " + matrix[dx][dy]);
                    if(matrix[dx][dy] > matrix[x][y]) {
                        tmp[i] = matrix[dx][dy];
                        tmpdx[i] = dx;
                        tmpdy[i] = dy;
                        // System.out.println("check: dx-dy: " + dx + "-" + dy);
                    }
                }
            }
            int min = Integer.MAX_VALUE;
            int change = 0;
            for(int i = 0;i < 8; i++) {
                if(tmp[i] < min && tmp[i] != 0) {
                    min = tmp[i];
                    x = tmpdx[i];
                    y = tmpdy[i];
                    change = 1;
                    // System.out.println("check: x-y" + x  + "-" + y);
                }
            }
            if(change == 0) {break; } else {
                res++;
            }
        }
        return res;
    }
}
