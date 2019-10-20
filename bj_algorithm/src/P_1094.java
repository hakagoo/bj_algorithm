import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P_1094 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(64);
		
		while(true) {
			int sum = 0;
			for(int a : arr) {
				sum += a;
			}
			if(sum == x) {
				break;
			} else if(sum > x) {				
				int tmp = arr.get(arr.size()-1);
				arr.remove(arr.size()-1);
				arr.add(tmp/2);
				arr.add(tmp/2);
				int tmpSum = 0;
				for(int i = 0; i < arr.size()-1; i++) {
					tmpSum += arr.get(i);
				}
				if(tmpSum >= x) {
					arr.remove(arr.size()-1);
				}
			}
			
		}
		
		System.out.println(arr.size());
		
	}
}
