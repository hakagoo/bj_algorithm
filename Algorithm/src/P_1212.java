import java.util.Scanner;

public class P_1212 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String sNumOc = sc.nextLine(); //314
		char[] temp = sNumOc.toCharArray(); //3, 1, 4
		int[] numOc = new int[sNumOc.length()]; 
		
		for (int i = 0; i < sNumOc.length(); i++) {
			numOc[i] = Integer.parseInt(String.valueOf(temp[i]));
			String tmp = Integer.toBinaryString(numOc[i]);
			if(i != 0) {
				if(tmp.length() == 1) {
					tmp = "00" + tmp;
				} else if(tmp.length() == 2) {
					tmp = "0" + tmp;
				}
				System.out.print(tmp);
			} else {
				System.out.print(tmp);
			}
	
		}
	}
}
