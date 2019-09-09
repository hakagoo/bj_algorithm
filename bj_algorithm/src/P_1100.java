

import java.util.Scanner;

public class P_1100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[][] chess = new char[8][8];
		int count = 0;
		
		for(int i = 0; i < chess.length; i++) {
			String line = sc.nextLine();
			for(int j = 0; j < chess[i].length; j++) {
				chess[i][j] = line.toCharArray()[j];
			}
		}
		
		for(int i = 0; i < chess.length; i++) {
			for(int j = 0; j < chess[i].length; j++) {
				if((i+j) % 2 == 0 && chess[i][j] == 'F') {
					count++;
				}
			}
		}
		System.out.println(count);
		
	}
}
