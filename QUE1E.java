import java.lang.*;
import java.util.*;

public class QUE1E  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<t; i++) {
            int n = sc.nextInt();
            int[] height = new int[n];
            sc.nextLine();
            for(int j = 0; j<n; j++) {
                height[j] = sc.nextInt();
            }
            int[] count = new int[n];

            for(int j = 0; j<n; j++) {
                count[j] = sc.nextInt();
            }

            int [][] people = new int[n][2];
            for(int j = 0; j<n; j++) {
                people[j][0] = height[j];
                people[j][1] = count[j];
            }
    
            Arrays.sort(people, (a, b) -> b[0] - a[0]);
    
            List<Integer> order = new ArrayList<>();
            for(int j = 0; j<n; j++) {
                order.add(people[j][1], people[j][0]);
            }

            for(int h: order) {
                System.out.print(h + " ");
            }

            System.out.println();
        }
    }
}
