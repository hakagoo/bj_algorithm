

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P_1032 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		String[] inputs = new String[n];
		List<Character> result = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			inputs[i] = sc.nextLine();
			for(int j = 0; j < inputs[i].length(); j++) {
				if(i == 0) {					
					result.add(inputs[i].charAt(j));
				} else {
					if(result.get(j) != inputs[i].charAt(j)) {
						result.remove(j);
						result.add(j, '?');
					}
				}
			}
		}
		
		for(char r : result) {
			System.out.print(r);
		}
		
	}
}
