import java.lang.*;
import java.util.*;

public class TOANDFRO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if(n==0) break;
            sc.nextLine();
            String s =  sc.nextLine();
            int lenght = s.length();
            int row = lenght/n;
            char[][] arr = new char[row][n];
            for(int i = 0; i<row; i++) {
                for(int j = 0; j<n; j++) {
                    if(i%2==0)
                        arr[i][j] = s.charAt(n*i+j);
                    else arr[i][n-j-1] = s.charAt(n*i+j);
                }
            }
            StringBuilder res = new StringBuilder();
            for(int j = 0; j<n; j++) {
                for(int i = 0; i<row; i++) {
                    res.append(arr[i][j]);
                }
            }
            System.out.println(res);
        }

    }
}
