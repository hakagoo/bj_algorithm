import java.util.Scanner;

public class P_1159 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String[] names = new String[n];
		boolean[] check = new boolean[26];
		int[] counter = new int[26];
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			names[i] = sc.nextLine();
			char init = names[i].charAt(0);
			counter[init - 'a']++;
		}
		
		for(int i = 0; i < 26; i++) {
			if(counter[i] >= 5) {
				check[i] = true;
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("PREDAJA");
		} else {
			String result = "";
			for(int i = 0; i < 26; i++) {
				if(check[i]) {
					System.out.print((char)(i+'a'));
				}
			}			
		}
	}
}
