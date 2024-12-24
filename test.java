    
import java.util.*;
import java.lang.*;

public class test {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();

		for(int i = 0; i<t; i++) {
			int n = sc.nextInt();
			sc.nextLine();
			String res = "";
			for(int j = 0; j<n; j++) {
				String s = sc.nextLine();
				int[] password = new int[s.length()];
				for(int k = 0; k<s.length(); k++) {
					password[k] = s.charAt(k) - '0';
				}
				int x = solve(password);
				res+=x;
			}
			System.out.println("#" + (i+1) + " " + res);
		}
		sc.close();
	}

	private static int solve(int[] password) {
		if(password.length < 4) return 0;
		int x = 1;
		int[][] position = {
			{0,0}, {0,1}, {0,2}, // 1,2,3
			{1,0}, {1,1}, {1,2}, //4,5,6
			{2,0}, {2,1}, {2,2}  //7,8,8
		};

		Set<Integer> pot = new HashSet<>();

		pot.add(password[0]);

		for(int i = 1; i<password.length; i++) {
			if(pot.contains(password[i])) {
				x = 0;
				break;
			}
			if(checkrow(position, password[i], password[i-1])!=-1) {
				if(pot.contains(checkrow(position, password[i], password[i-1]))) {
					pot.add(password[i]);
				} else {
					x = 0;
					break;
				}
			} else {
				pot.add(password[i]);
			}
		}
		return x;
	}


	private static int checkrow(int[][] position, int x, int y) {
		int posx1 = position[x-1][0];
		int posy1 = position[x-1][1];

		int posx2 = position[y-1][0];
		int posy2 = position[y-1][1];

		if(posx1 == posx2 && Math.abs(posy2-posy1) == 2) {
			return (x+y)/2;
		} 
		if(posy1 == posy2 && Math.abs(posx2-posx1) == 2) {
			return (x+y)/2;
		}
		if(Math.abs(posy2-posy1) == 2 && Math.abs(posx2-posx1)==2) {
			return (x+y)/2;
		}
		return -1;
	}
}
