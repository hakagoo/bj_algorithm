import java.util.Scanner;

public class Temp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] phone_book = new String[n];
		
		boolean answer = true;
		for(int i = 0; i < phone_book.length; i++) {
			for(int j = 0; j < phone_book.length; j++) {
				if(phone_book[i].startsWith(phone_book[j])) {
					answer = false;
					break;
				}
			}
		}
		
	}
}
