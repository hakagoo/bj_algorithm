import java.util.Scanner;

public class P_1915{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] dp = new int[n+1][n+1];
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                dp[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(j == 1) dp[i][j] = dp[i-1][j] + dp[i][j];
                else if(j == i) dp[i][j] = dp[i-1][j-1] + dp[i][j];
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]) + dp[i][j];
                }
                if(dp[i][j] > max) max = dp[i][j];
            }
        }
        System.out.println(max);
    }
}
