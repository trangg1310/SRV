import java.lang.*;
import java.util.*;

public class PAIRS1E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i< t; i++) {
            sc.nextLine();
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();

            int[] arr = new int[n];
            for(int j = 0; j<n; j++) {
                arr[j] = sc.nextInt();
            }

            System.out.println(pairs(arr, k));
        }
    }

    private static int pairs(int[] arr, int k) {
        int count = 0;
        for(int i = 0; i< arr.length-1; i++) {
            for(int j = i+1; j<arr.length; j++) {
                if((int)Math.abs(arr[i]-arr[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
