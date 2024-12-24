import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int m = sc.nextInt();
            int n = sc.nextInt();
            sc.nextLine();
            int[][] arr = new int[m][n];
            for(int j = 0; j<m; j++) {
                for(int k = 0; k<n; k++) {
                    arr[j][k] = sc.nextInt();
                }
                sc.nextLine();
            }
            System.out.print("#" + (i+1) + " ");
            System.out.print(probo(arr, h, w, m, n));
            System.out.println();
        }
	}
	private static int probo(int[][] arr, int h, int w, int m, int n) {
        int i = 0;
        int j = 0;
        int res = 0;
        int max = 0;
        while(i < m && i + h <= m) {
            while (j<n && j+w<=n) {
                res=0;
                for(int x = i; x<i+h; x++) {
                    for(int y = j; y<j+w; y++) {
                        if(y==j || y == j+w-1) {
                            if(arr[x][y]%2==0) res+=arr[x][y];
                        } else if(x==i || x==i+h-1) {
                            if(arr[x][y]%2==0) res+=arr[x][y];
                        }
                    }
                }
                if(res>max) max = res;
                j++;
            }
            i++;
        }
        return max;
    }
}