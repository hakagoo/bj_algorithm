import java.util.Scanner;
import java.util.Stack;

public class P_9012 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.nextLine());
		String result = "";
		for(int i = 0; i < t; i++) {
			char[] input = sc.nextLine().toCharArray();
			Stack<Character> stack = new Stack<>();
			boolean flag = true;
			for(int j = 0; j < input.length; j++) {
				if(input[j] == '(') {
					stack.push(input[j]);
				} else if(input[j] == ')') {
					if(stack.isEmpty()) {
						stack.push(input[j]);
						break;
					} else {						
						stack.pop();
					}
				}
			}
			result += (stack.isEmpty() ? "YES\n" : "NO\n");
		}
		System.out.println(result);
	}
}
