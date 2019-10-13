import java.util.Scanner;
import java.util.Stack;

public class Temp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arrangement = sc.nextLine();
		
		int answer = 0;
		char[] arr = arrangement.toCharArray();
		Stack<Integer> s = new Stack<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == '(') {
				s.push(i);
			} else {
				if(s.peek()+1 == i) {
					s.pop();
					answer += s.size();
				} else {
					s.pop();
					answer++;
				}
			}
		}
		
		
		
		
		
	}
}
