import java.math.BigInteger;
import java.util.Scanner;

public class P_1010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(combination(n, m));
		}
		
	}
	
	public static BigInteger combination(int n, int m) {
		BigInteger result = new BigInteger("1");
		int tmp = n;
		
		for(int i = m; i > m-n; i--) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		
		for(int i = tmp; i >= 1; i--) {
			result = result.divide(BigInteger.valueOf(i));
		}
		
		return result;
	}
	
}
