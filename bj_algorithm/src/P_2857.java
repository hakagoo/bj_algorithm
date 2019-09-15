import java.util.Scanner;

public class P_2857 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String result = "";
		
		for(int i = 1;	 i <= 5; i++) {
			String name = sc.nextLine();
			if(name.contains("FBI")) {
				result += i + " ";
			}
		}
		
		if(result.equals("")) {
			System.out.println("HE GOT AWAY!");
		} else {
			System.out.println(result);
		}
		
	}
}
