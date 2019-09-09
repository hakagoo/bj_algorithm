

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P_2864 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split(" ");
		List<Integer> list = new ArrayList<>(); 
		
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		
		list.add(a+b);
		
		int max = Integer.parseInt(input[0].replace("5", "6")) + Integer.parseInt(input[1].replace("5", "6"));
		int min = Integer.parseInt(input[0].replace("6", "5")) + Integer.parseInt(input[1].replace("6", "5"));

		list.add(max);
		list.add(min);
		Collections.sort(list);
		
		System.out.println(list.get(0) + " " + list.get(list.size()-1));
	
	}
}
