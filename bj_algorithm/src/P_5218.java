

import java.util.Scanner;

public class P_5218 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		String result = "";
		
		for(int i = 0; i < n; i++) {
			result += "Distances: ";
			String[] input = sc.nextLine().split(" ");
			char[] first = input[0].toCharArray();
			char[] second = input[1].toCharArray();
			
			for(int j = 0; j < first.length; j++) {
				if(first[j] <= second[j]) {
					result += second[j]-first[j] + " ";
				} else {
					result += second[j]-first[j] + 26 + " ";
				}
			}
			result += "\n";
		}
		System.out.println(result);
	}
}
