import java.util.Scanner;

public class P_2579 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] s = new int[n+1];
		int[] dp = new int[n+1];
		for(int i = 1; i <= n; i++) {
			s[i] = Integer.parseInt(sc.nextLine());
		}
		dp[1] = s[1];
		if(n >= 2) dp[2] = dp[1] + s[2];
		for(int i = 3; i <= n; i++) {
			dp[i] = Math.max(dp[i-2]+s[i], dp[i-3]+s[i]+s[i-1]);
		}
		
		System.out.println(dp[n]);
	}
}
