import java.util.Scanner;
import java.util.Stack;

public class P_5397 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < t; i++) {
			char[] input = sc.nextLine().toCharArray();
			Stack<Character> s1 = new Stack<>();
			Stack<Character> s2 = new Stack<>();
			for(int j = 0; j < input.length; j++) {
				if(input[j] == '<') {
					if(!s1.isEmpty()) {
						s2.push(s1.pop());
					}
				} else if(input[j] == '>') {
					if(!s2.isEmpty()) {
						s1.push(s2.pop());
					}
				} else if(input[j] == '-') {
					if(!s1.isEmpty()) {
						s1.pop();
					}
				} else {
					s1.push(input[j]);
				}
			}
			
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			StringBuilder sb = new StringBuilder();
			while(!s2.isEmpty()) {
				sb.append(s2.pop());
			}
			System.out.println(sb);
		}
	}
}
