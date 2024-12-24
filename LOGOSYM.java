import java.lang.*;
import java.util.*;

public class LOGOSYM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i<t; i++) {
            int n = sc.nextInt();
            int[][] matrix = new int[n][n];
            for(int j = 0; j<n; j++) {
                for(int k = 0; k<n; k++) {
                    matrix[j][k] = sc.nextInt();
                }
            }
            String res = logo(matrix, n);
            System.out.println("#" + (i+1) +" " + res);
        }
    }

    private static String logo(int[][] matrix, int n) {

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                if(matrix[i][j]!=matrix[n-i-1][j] || matrix[i][j] != matrix[i][n-j-1]) {
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
