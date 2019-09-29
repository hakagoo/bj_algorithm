import java.util.Scanner;

public class P_2935 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String operator = sc.nextLine();
		String b = sc.nextLine();
		String result = "";
		
		switch (operator) {
		case "+":
			System.out.println(plus(a, b));
			
			break;
		case "*":
			for(int i = 1; i < b.length(); i++) {
				a += String.valueOf(b.charAt(i));
			}
			System.out.println(a);
			break;
		}
	}
	
	public static String plus(String a, String b) {
		String A = a;
		String B = b;
		if(a.length() < b.length()) {
			A = b;
			B = a;
		}
		String tmp = "";
		for(int i = 0; i < A.length() - B.length(); i++) {
			tmp += "0";
		}
		tmp += B;
		
		String result = "";
		for(int i = 0; i < A.length(); i++) {
			if(A.charAt(i) == '1' && tmp.charAt(i) == '1') {
				result += "2";
			} else if(A.charAt(i) == '0' && tmp.charAt(i) == '0') {
				result += "0";
			} else {
				result += "1";
			}
		}
		
		return result;
	}
}
