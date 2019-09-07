

import java.util.Arrays;
import java.util.Scanner;

public class P_11656 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] suffix = new String[input.length()];
		
		for(int i = 0; i < input.length(); i++	){
			suffix[i] = input.substring(i, input.length());
		}
		
		Arrays.sort(suffix);
		
		for(String s : suffix) {
			System.out.println(s);
		}
		
	}
}
