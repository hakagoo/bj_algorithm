

import java.util.Scanner;

public class P_10987 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] input = sc.nextLine().toCharArray();
		int result = 0;
		
		for(int i = 0; i < input.length; i++) {
			switch (input[i]) {
			case 'a' : case 'e' : case 'i' : case 'o' : case 'u':
				result++;
				break;
			default:
				break;
			}
		}
		
		System.out.println(result);
		
	}
}
