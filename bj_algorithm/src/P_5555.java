import java.util.Scanner;

public class P_5555 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		int n = Integer.parseInt(sc.nextLine());
		int result = 0;
		for(int i = 0; i < n; i++) {
			String ring = sc.nextLine();
			for(int j = 0; j < input.length()-1; j++) {
				ring += String.valueOf(ring.charAt(j));
			}
			
			if(ring.contains(input)) {
				result++;
			}
		}
		
		System.out.println(result);
		
		
	}
}
