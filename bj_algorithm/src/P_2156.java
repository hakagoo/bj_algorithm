import java.util.Scanner;

public class P_2156{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] w = new int[n+1];
        int[] dp = new int[n+1];
        
        for(int i = 1; i <= n; i++){
            w[i] = Integer.parseInt(sc.nextLine());
        }
        
        dp[1] = w[1];
        if(n >= 2){
            dp[2] = dp[1] + w[2];
            for(int i = 3; i <= n; i++){
                dp[i] = Math.max(dp[i-2] + w[i], Math.max(dp[i-1], dp[i-3]+w[i-1]+w[i]));
            }
        }
        System.out.println(dp[n]);
    }
}