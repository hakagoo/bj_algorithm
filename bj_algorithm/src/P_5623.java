import java.util.Scanner;

public class P_5623 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] t = new int[n][n];
		int[] s = new int[n];
		
		if(n == 2) {
			System.out.println("1 1");
		}
		
		if(n > 2) {			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					t[i][j] = sc.nextInt();
				}
			}
			s[0] = ((t[0][1] + t[0][2] + t[1][2]) / 2) - t[1][2];
			
			String result = s[0] + " ";
			for(int i = 1; i < n; i++) {
				t[i][0] -= s[0];
				result += t[i][0] + " ";
			}
			System.out.println(result);
		}
		
		
	}
}
