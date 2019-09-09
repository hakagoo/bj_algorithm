import java.util.Scanner;
import java.util.Stack;

public class P_9093 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.nextLine());
		String result = "";
		
		for(int i = 0; i < t; i++) {
			String[] input = sc.nextLine().split(" ");
			Stack<Character> stack = new Stack<>();
			
			for(int j = 0; j < input.length; j++) {
				char[] word = input[j].toCharArray();
				
				for(int k = 0; k < word.length; k++) {
					stack.push(word[k]);
				}
				for(int k = 0; k < word.length; k++) {
					System.out.print(stack.pop());
				}
				System.out.print(" ");
			}
			System.out.println();
			
		}
		System.out.println(result);
	}
}
