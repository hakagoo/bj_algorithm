import java.util.Scanner;

public class P_2998 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String[] table = {"000", "001", "010", "011", 
						"100", "101", "110", "111"};
		
		while(str.length()%3 != 0) {
			str = "0" + str;
		}
		
		String[] result = new String[str.length()/3];
		String r = "";
		
		for(int i = 0; i < result.length; i++) {
			result[i] = str.substring(0, 3);
			str = str.substring(3);
			for(int j = 0; j < table.length; j++) {
				if(result[i].equals(table[j])) {
					result[i] = String.valueOf(j);
				}
			}
			r += result[i];
		}
		
		System.out.println(r);
		
		
	}
}
