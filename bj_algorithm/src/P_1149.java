import java.util.Scanner;

public class P_1149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] t = new int[n+1][3];
		int[][] dp = new int[n+1][3];
		
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < 3; j++) {
				t[i][j] = sc.nextInt();
			}
		}

		for(int i = 1; i <= n; i++) {
			dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + t[i][0];
			dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + t[i][1];
			dp[i][2] = Math.min(dp[i-1][1], dp[i-1][0]) + t[i][2];
		}
		
		int result = Math.min(dp[n][0], Math.min(dp[n][1], dp[n][2]));
		System.out.println(result);
		
	}
	
	
}
