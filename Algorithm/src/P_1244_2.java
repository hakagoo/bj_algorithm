import java.util.Scanner;

public class P_1244_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int[] array = new int[n + 1];
	 
	    for (int i = 1; i <= n; i++) {
	        array[i] = sc.nextInt();
	    }
	 
	    int t = sc.nextInt();
	 
	    while (t-- > 0) {
	        int sex = sc.nextInt();
	        int idx = sc.nextInt();
	 
	        if (sex == 1) {
	            // 남 
	            for (int i = idx; i <= n; i += idx) {
	                array[i] = array[i] == 0 ? 1 : 0;
	            }
	        } else {
	            if ((idx == 1 || idx == n) || array[idx - 1] != array[idx + 1]) {
	                array[idx] = array[idx] == 0 ? 1 : 0;
	            } else {
	                int left = idx - 1;
	                int right = idx + 1;
	                array[idx] = array[idx] == 0 ? 1 : 0;
	                while (left > 0 && right <= n) {
	                    if (array[left] == array[right]) {
	                        array[left] = array[left] == 0 ? 1 : 0;
	                        array[right] = array[right] == 0 ? 1 : 0;
	                        --left;
	                        ++right;
	                    } else {
	                        break;
	                    }
	                }
	            }
	        }
	    }
	    for (int i = 1; i <= n; i++) {
	        System.out.print(array[i] + " ");
	        if (i % 20 == 0) {
	            System.out.println();
	        }
	    }

	}
}
