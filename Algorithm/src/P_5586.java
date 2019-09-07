import java.util.Scanner;

public class P_5586 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String[] check = {"JOI", "IOI"};
		
		int joi = 0;
		int ioi = 0;
		
		for(int i = 0; i < str.length()-2; i++) {
			String tmp = str.substring(i, i+3);
			if(tmp.equals(check[0])) {
				joi++;
			} else if(tmp.equals(check[1])) {
				ioi++;
			}
		}
		
		System.out.println(joi + "\n" + ioi);
		
		
	}
}
