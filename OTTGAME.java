import java.lang.*;
import java.util.*;
public class OTTGAME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i<t; i++) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            int[][] arr = new int[q][n];
            for(int j = 0; j<q; j++) {
                for(int k = 0; k<n; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }
            System.out.print("#" + (i+1)+ " ");
            solve(arr, n, q);
            System.out.println();
        }
    }

    private static void solve(int[][] arr, int n, int q) {
        boolean[] res = new boolean[n];
        for(int i = 0; i< n; i++) {
            res[i] = true;
        }

        for(int i = 0; i<q; i++) {
            boolean[] check = new boolean[3];
            for(int j = 0; j<n; j++) {
                if(res[j]) {
                    if(arr[i][j] == 1) {
                        check[0] = true;
                    }
                    if(arr[i][j] == 2) {
                        check[1] = true;
                    }
                    if(arr[i][j] == 3) {
                        check[2] = true;
                    }
                }
            }
            if (count(check) == 2) {
                int x = type(check);
                for(int j = 0; j<n; j++) {
                    if(res[j]) {
                        if(x==0) {
                            if(arr[i][j] == 2) res[j] = false;
                        }
                        else if (x==1) {
                            if(arr[i][j] == 3) res[j] = false;
                        } else if(x==2) {
                            if(arr[i][j] == 1) res[j] = false;
                        }
                    }
                }
            }
        }
        for(int i = 0; i<n; i++) {
            if(res[i]) System.out.print((i+1) + " ");
        }
    }

    private static int count(boolean[] check) {
        int res = 0;
        for(int i = 0; i<3; i++) {
            if(check[i]) {
                res+=1;
            }
        }
        return res;
    }

    private static int type(boolean[] check) {
        if(check[0] == false) return 0;
        else 
        if(check[1] == false) return 1;
        else
        if(check[2] == false) return 2;
        return -1;
    }

}
