import java.util.Scanner;

public class P_9095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		int[] dp = new int[12];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		String result = "";
		
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(sc.nextLine());
			for(int j = 4; j <= n; j++) {
				dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
			}
			result += dp[n] + "\n";
		}
		
		System.out.println(result);
	}
}
