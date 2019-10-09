import java.util.Scanner;

public class P_1003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		int[][] dp = new int[41][2];
		dp[0][0] = dp[1][1] = 1;
		
		for(int i = 2; i <= dp.length-1; i++) {
			dp[i][0] = dp[i-1][0] + dp[i-2][0];
			dp[i][1] = dp[i-1][1] + dp[i-2][1];
		}
		
		String result = "";
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(sc.nextLine());
			result += dp[n][0] + " " + dp[n][1] + "\n";
		}
		
		System.out.println(result);
	}
}
