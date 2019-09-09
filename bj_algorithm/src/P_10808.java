

import java.util.Scanner;

public class P_10808 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] input = sc.nextLine().toCharArray();
		int[] count = new int[26];
		
		for(int i = 0; i < count.length; i++) {
			count[i] = 0;
		}
		
		for(int i = 0; i < input.length; i++) {
			count[input[i] - 'a']++;
		}
		
		for(int c : count) {
			System.out.print(c + " ");
		}
		
	}
}
