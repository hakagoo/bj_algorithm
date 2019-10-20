import java.util.Scanner;

public class P_1977 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result = 0;
		int min = 0;
		for(int i = a; i <= b; i++) {
			if(find(i)) {
				if(result == 0) {
					min = i;
				}
				result += i;
			}
			
			if(result == 0 && i == b) {
				result = -1;
			}
		}
		
		System.out.println(result);
		if(min != 0) {
			System.out.println(min);
		}
		
	}
	
	public static boolean find(int i) {
		int n = 1;
		while(true) {
			if(i == n*n) {				
				return true;
			} else if(i < n*n){
				return false;
			} else {
				n++;
			}
		}
	}
}
