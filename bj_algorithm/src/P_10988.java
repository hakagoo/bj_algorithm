

import java.util.Scanner;

public class P_10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] input = sc.nextLine().toCharArray();
		int length = 0;
		
		if(input.length % 2 == 0) {
			length = input.length/2;
		} else {
			length = input.length/2 + 1;
		}
		
		int result = 0;
		
		for(int i = 0; i < length; i++) {
			if(input[i] != input[input.length - 1 - i]) {
				result = 0;
				break;
			} else {
				result = 1;
			}
		}
		System.out.println(result);
		
	}
}
