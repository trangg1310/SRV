import java.lang.*;
import java.util.*;

public class QKPE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        int c = 0;
        do{
            m = sc.nextInt();
            n = sc.nextInt();
            c++;
            if(!(m== n && m==0)) {
                sc.nextLine();
                int k = sc.nextInt();
                int[] pq = new int[k*2];
                for(int i = 0; i < 2*k ; i++) {
                    pq[i] = sc.nextInt();
                }
                sc.nextLine();
                k = sc.nextInt();
                int[] pk = new int[k*2];
                for(int i = 0; i<2*k; i++) {
                    pk[i] = sc.nextInt();
                }
                sc.nextLine();
                k = sc.nextInt();
                int[] pp = new int[2*k];
                for(int i = 0; i<2*k; i++) {
                    pp[i] = sc.nextInt();
                }  
                sc.nextLine();
                int res = qkp(m, n, pq, pk, pp);
                System.out.println("Board " + c + " has " + res + " safe squares.");
            } else {
                break;
            }
        } while(true);
    }
    
    private static int qkp(int m, int n, int[] pq, int[] pk, int[] pp) {
        char[][] chess = new char[m][n];
        int[] pki = {-2, -2, 2, 2, -1, 1, 1, -1};
        int[] pkj = {-1, 1, 1, -1, 2, 2, -2, -2};
        int[] pqi = {-1, 0, 1, 0, -1, 1, 1, -1};
        int[] pqj = {0, 1, 0, -1, 1, 1, -1, -1};
        for(int i = 0; i<m; i++) {
            for(int j = 0; j<n; j++) {
                chess[i][j] = 'O';
            }
        }

        for(int i = 0; i< pq.length; i++) {
            if(i%2==0)
                chess[pq[i]-1][pq[i+1]-1] = 'Q';
        }
        for(int i = 0; i<pk.length; i++) {
            if(i%2==0)
                chess[pk[i]-1][pk[i+1]-1] = 'K';
        }
        for(int i = 0; i<pp.length; i++) {
            if(i%2==0) 
                chess[pp[i]-1][pp[i+1]-1] = 'P';
        }

        for(int i = 0; i< m; i++) {
            for(int j = 0; j<n; j++) {
                if(chess[i][j]=='K') {
                    for(int k = 0; k<8; k++) {
                        if(i+pki[k]>=0 && i+pki[k]<m && j+pkj[k]>=0 && j+pkj[k]<n && chess[i+pki[k]][j+pkj[k]]=='O') {
                            chess[i+pki[k]][j+pkj[k]] = 'Y';
                        }
                    }
                } else if(chess[i][j]=='Q') {
                    for(int k = 0; k<8; k++) {
                        int ni = i;
                        int nj = j;
                        while (true) {
                            ni += pqi[k];
                            nj += pqj[k];
                            if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
                                if (chess[ni][nj] == 'Q' || chess[ni][nj] == 'K' || chess[ni][nj] == 'P') {
                                    break;
                                }
                                chess[ni][nj] = 'Y';
                            } else {
                                break;
                            }
                        }
                    }
                }
            }   
        }

        int res = 0;
        for(int i = 0; i<m; i++) {
            for(int j = 0; j<n; j++) {
                if(chess[i][j]=='O') res++;
            }
        }
        return res;
    }
}
