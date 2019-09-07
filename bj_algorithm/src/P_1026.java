

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P_1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		String[] strA = sc.nextLine().split(" ");
		String[] strB = sc.nextLine().split(" ");
		
		int[] arrA = new int[n];
		int[] arrB = new int[n];
		List<Integer> listB = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			arrA[i] = Integer.parseInt(strA[i]);
			listB.add(Integer.parseInt(strB[i]));
		}
		Arrays.sort(arrA); 
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			int maxIndex = listB.indexOf(Collections.max(listB));
			result += arrA[i] * listB.get(maxIndex);
			listB.remove(maxIndex);
		}
		
		System.out.println(result);
		
	}
}
