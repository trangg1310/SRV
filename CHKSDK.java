import java.lang.*;
import java.util.*;

public class CHKSDK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        for(int i= 0; i<t; i++) {
            char[][] matrix = new char[9][9];
            for(int j = 0; j<9; j++) {
                matrix[j] = sc.nextLine().toCharArray();
            }
            int res = chksdk(matrix);

            System.out.println("#" + (i+1) + " " + res);
        }
    }

    private static int chksdk(char[][] matrix) {
        int res = 1;
        // check hang
        for(int i = 0; i<9; i++) {
            int[] row = new int[10];
            for(int j = 0; j<9; j++) {
                if(matrix[i][j]!='.') {
                    int tmp = matrix[i][j]-'0';
                    if(row[tmp] == 1) {
                        res = 0;
                        break;
                    } else row[tmp] = 1;
                }
            }
        }
        // check cot
        for(int i = 0; i<9; i++) {
            int[] col = new int[10];
            for(int j = 0; j<9; j++) {
                if(matrix[j][i]!='.') {
                    int tmp = matrix[j][i] -'0';
                    if(col[tmp] == 1) {
                        res = 0;
                        break;
                    } else col[tmp] = 1;
                }
            }
        }

        //check 3*3
        for(int i = 0; i<9; i+=3) {
            for(int j = 0; j<9; j+=3) {
                int[] m3 = new int[10];
                for(int x = i; x<i+3; x++) {
                    for(int y = j; y<j+3; y++) {
                        if(matrix[x][y]!='.') {
                            int tmp = matrix[x][y] - '0';
                            if(m3[tmp]==1) {
                                res = 0;
                                break;
                            } else m3[tmp] = 1;
                        }
                    }
                }
            }
        }

        return res;
    }
}
