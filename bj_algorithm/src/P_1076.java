import java.util.Scanner;

public class P_1076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] r = { "black", "brown", "red", "orange", "yellow", 
					   "green", "blue", "violet", "grey", "white" };
		String[] c = new String[3];
		for(int i = 0; i < c.length; i++) {
			c[i] = sc.nextLine();
		}
		
		long result = 0;
		String tmp = "";
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < r.length; j++) {
				if(c[i].equals(r[j])) {
					if(i == 0 || i == 1) {
						tmp += String.valueOf(j);
					} else if(i == 2) {
						result = Long.parseLong(tmp);
						for(int k = 0; k < j; k++) {
							result *= 10;
						}
					}
				}
			}
		}
		System.out.println(result);
	}
}
