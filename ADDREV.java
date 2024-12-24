import java.util.*;
import java.lang.*;

public class ADDREV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i<n; i++) {
            Rev tmp = new Rev();
            int num1 = tmp.rev(sc.nextInt());
            int num2 = tmp.rev(sc.nextInt());
            System.out.println(tmp.rev(num1+num2));
        }
    }
}

class Rev {
    public int rev(int x) {
        int res = 0;
        while(x>0) {
            res = x%10 + res*10;
            x = x/10;  
        }
        return res;
    }
}