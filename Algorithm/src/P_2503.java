import java.util.Scanner;

public class P_2503 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		String[] submit = new String[n];
		int[] strikes = new int[n];
		int[] balls = new int[n];
		boolean[] check = new boolean[1000];
		for(int i = 0; i < check.length; i++) {
			check[i] = true;
		}
		
		for(int i = 0; i < n; i++) {
			String[] s = sc.nextLine().split(" ");
			submit[i] = s[0];
			strikes[i] = Integer.parseInt(s[1]);
			balls[i] = Integer.parseInt(s[2]);
		}
		
		for(int i = 123; i <= 999; i++) {
			String sI = String.valueOf(i);
			if(sI.charAt(0) == sI.charAt(1) || sI.charAt(0) == sI.charAt(2) || sI.charAt(1) == sI.charAt(2)) {
				check[i] = false;
			}
			if(sI.charAt(0) == '0' || sI.charAt(1) == '0'|| sI.charAt(2) == '0') {
				check[i] = false;
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 123; j <= 999; j++) {
				
				int strikeCount = 0;
				int ballCount = 0;
				
				if(check[j]) {
					
					String a = submit[i];
					String b = String.valueOf(j);
					
					for(int k = 0; k < 3; k++) {
						for(int l = 0; l < 3; l++) {
							if(k == l && (a.charAt(k) == b.charAt(l)) ) {
								strikeCount++;
							}
							if(k != l && (a.charAt(k) == b.charAt(l)) ) {
								ballCount++;
							}
						}
					}
					if(strikeCount != strikes[i] || ballCount != balls[i]) {
						check[j] = false;
					}
					
				}
				
			}
		}
		int result = 0;
		for(int i = 123; i <= 999; i++) {
			if(check[i]) {
				result++;
			}
		}
		System.out.println(result);
		
		
	}
}
