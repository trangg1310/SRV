import java.lang.*;
import java.util.*;

public class FSTDUP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i<t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j<n; j++) {
                arr[j] = sc.nextInt();
            }

            int maxvalue = arr[0];
            for(int j = 1; j<n; j++) {
                if(arr[j] > maxvalue) {
                    maxvalue = arr[j];
                }
            }

            int res = -1;
            boolean[] mark = new boolean[maxvalue+1];

            for(int j = 0; j<n; j++) {
                if(!mark[arr[j]]) {
                    mark[arr[j]] = true;
                } else {
                    res = arr[j];
                    break;
                }
            }
            System.out.println("#" + (i+1) + " " + res);
        }
        
        sc.close();
    }
}