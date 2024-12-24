import java.lang.*;
import java.util.*;

public class SLTKNGHT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0;i<t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();

            int[][] pk = new int[k][2];
            int[][] pm = new int[m][2];
            int[][] pd = new int[d][2];

            for(int j = 0; j<k; j++) {
                pk[j][0] = sc.nextInt();
                pk[j][1] = sc.nextInt();
            }

            for(int j = 0; j<m; j++) {
                pm[j][0] = sc.nextInt();
                pm[j][1] = sc.nextInt();
            }

            for(int j = 0; j<d; j++) {
                pd[j][0] = sc.nextInt();
                pd[j][1] = sc.nextInt();
            }

            System.out.print("#" + (i+1) + " ");
            solution(n, pk, pm, pd, k, m, d);
            System.out.println();
        }
    }

    private static void solution(int n, int[][] pk, int[][] pm, int[][] pd, int k, int m, int d) {
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
    
        // Mảng đánh dấu
        boolean[][] isKnight = new boolean[n][n];
        boolean[][] isObstacle = new boolean[n][n];
        boolean[][] isDestination = new boolean[n][n];
    
        for (int[] knight : pk) isKnight[knight[0]][knight[1]] = true;
        for (int[] obstacle : pm) isObstacle[obstacle[0]][obstacle[1]] = true;
        for (int[] destination : pd) isDestination[destination[0]][destination[1]] = true;
    
        int[] count = new int[k];
    
        for (int i = 0; i < k; i++) {
            for (int a = 0; a < 8; a++) { // Duyệt 8 nước đi của quân mã
                int dxk = pk[i][0] + dx[a];
                int dyk = pk[i][1] + dy[a];
                if (dxk >= 0 && dxk < n && dyk >= 0 && dyk < n) {
                    if ((isKnight[dxk][dyk] || isObstacle[dxk][dyk]) && !isDestination[dxk][dyk]) {
                        count[i]++;
                    }
                }
            }
        }
    
        int max = count[0];
        int x = 0;
        for (int i = 1; i < k; i++) {
            if (count[i] > max) {
                max = count[i];
                x = i;
            }
        }
        System.out.print(pk[x][0] + " " + pk[x][1] + " " + max);
    }
    
}
