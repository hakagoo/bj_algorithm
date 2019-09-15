import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P_1935 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		int[] num = new int[n];
		
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		Stack<Double> s = new Stack<>();
		for(int i = 0; i < input.length(); i++) {
				double tmp1;
				double tmp2;
			if(input.charAt(i) == '+') {
				tmp1 = s.pop();
				tmp2 = s.pop();
				s.push(tmp2 + tmp1);
			} else if(input.charAt(i) == '-') {
				tmp1 = s.pop();
				tmp2 = s.pop();
				s.push(tmp2 - tmp1);
			} else if(input.charAt(i) == '*') {
				tmp1 = s.pop();
				tmp2 = s.pop();
				s.push(tmp2 * tmp1);
			} else if(input.charAt(i) == '/') {
				tmp1 = s.pop();
				tmp2 = s.pop();
				s.push(tmp2 / tmp1);
			} else {
				s.push((double)(num[input.charAt(i) - 'A']));
			}
		}
		
		System.out.println(String.format("%.2f", s.peek()));
	}
}
