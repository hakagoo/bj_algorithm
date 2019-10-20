import java.util.Scanner;

public class P_1149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] t = new int[n+1][3];
		int[][] dp = new int[n+1][2];
		
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < 3; j++) {
				t[i][j] = sc.nextInt();
			}
		}

		for(int i = 1; i <= n; i++) {
			if(i == 1) {
				int min = 0;
				int minIndex = 0; //0 = r, 1 = g, 2 = b;
				for(int j = 0; j < 3; j++) {
					if(j == 0 || min > t[1][j]) {
						min = t[1][j];
						minIndex = j;
					}
					dp[1][0] = minIndex;
					dp[1][1] = min;
				}
			}
			
			if(i >= 2) {				
				if(dp[i-1][0] == 0) {
					dp[i][0] = ((t[i][1] > t[i][2]) ? 2 : 1);
					dp[i][1] += dp[i-1][1] + t[i][dp[i][0]];
				} else if(dp[i-1][0] == 1) {
					dp[i][0] = ((t[i][0] > t[i][2]) ? 2 : 0);
					dp[i][1] += dp[i-1][1] + t[i][dp[i][0]];
				} else if(dp[i-1][0] == 2) {
					dp[i][0] = ((t[i][0] > t[i][1]) ? 1 : 0);
					dp[i][1] += dp[i-1][1] + t[i][dp[i][0]];
				}
			}
			
		}
		
		System.out.println(dp[n][1]);
		
	}
}
