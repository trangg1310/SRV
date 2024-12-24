import java.lang.*;
import java.util.*;

public class CALEXP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i<t; i++) {
            int a = sc.nextInt();
            System.out.println("#" + (i+1) + " " + (int) Math.sqrt(a));
        }
    }
}
