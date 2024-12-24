import java.lang.*;
import java.lang.reflect.Array;
import java.util.*;

public class BLDTWR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i<t; i++) {
            int n = sc.nextInt();
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();

            int[] weight = new int[n];
            for(int j = 0; j<n; j++) {
                weight[j] = sc.nextInt();
            }
            int res = bld(weight, m1, m2);
            System.out.println("#" + (i+1) + " " + res);
        }
    }

    private static int bld(int[] weight, int m1, int m2) {
        Arrays.sort(weight);

        int cost = 0;
        int i = 1;
        int k = m1+m2-1;

        while (i<=m1 && i<=m2) {
            cost += (weight[k]+weight[k-1])*i;
            i++;
            k-=2;
        }

        while(i<=m1) {
            cost+= weight[k]*i;
            i++;
            k--;
        }

        while (i<=m2) {
            cost+=weight[k]*i;
            i++;
            k--;
        }
        return cost;
    }

}
