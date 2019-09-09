import java.util.Scanner;

public class P_1436 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;
		
		while(n > 0) {
			result++;
			String sResult = String.valueOf(result);
			
			if(isContain(sResult)) {
				n--;
			}	
			if(n == 0) {
				System.out.println(sResult);
			}
		}
	}
	
	static boolean isContain(String sResult) {
		if(sResult.contains("666")) {
			return true;
		} else {
			return false;
		}
	}
	
}
