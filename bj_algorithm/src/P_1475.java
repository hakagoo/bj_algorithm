

import java.util.Scanner;

public class P_1475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] input = sc.nextLine().toCharArray();
		
		int[] count = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		for(int i = 0; i < input.length; i++) {
			int num = Integer.parseInt(String.valueOf(input[i]));
			if(num == 6 || num == 9) {
				count[6]++;
				count[9]++;
			} else {
				count[num]++;
			}
		}
		
		if(count[6] % 2 == 0) {
			count[6] = count[6]/2;
			count[9] = count[9]/2;
		} else {
			count[6] = count[6]/2 + 1;
			count[9] = count[9]/2 + 1;			
		}
		
		int max = 0;
		for(int c : count) {
			if(max < c) {
				max = c;
			}
		}
		System.out.println(max);
		
	}
}
