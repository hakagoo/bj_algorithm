import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class P_1918 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] input = br.readLine().toCharArray();
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < input.length; i++) {
			if (input[i] == '(') {
				stack.push('(');
			} else if (input[i] == '*' || input[i] == '/') {
				while(!stack.isEmpty() && (stack.peek() == '*' || stack.peek() == '/')) {
					bw.write(stack.pop());
				}
				stack.push(input[i]);
			} else if (input[i] == '+' || input[i] == '-'){
				while(!stack.isEmpty() && stack.peek() != '(') {
					bw.write(stack.pop());
				}
				stack.push(input[i]);
			} else if (input[i] == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					bw.write(stack.pop());
				}
				if(!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				}
			} else {
				bw.write(input[i]);
			}
		}
		while (!stack.isEmpty()) {
			bw.write(stack.pop());
		}

		bw.flush();
//(A+(B*C))-(D/E)
	}
}
