import java.util.Scanner;
/*두 자연수 A,B (A>B), A를 B로 나눴을 때 나머지를 r이라고 하면, 
	최대공약수(gcd) = 
	gcd(A, B) = gcd(B, r)
	
	최소공배수(lcm)는
	gcd(A, B) * A/gcd(A, B) * B / gcd(A, B)
*
*/
public class P_2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.nextLine();
		
		int g = gcd(a, b);
		int l = g * a/g * b/g;
		
		System.out.println(g);
		System.out.println(l);
		
		
	}
	
	public static int gcd(int a, int b) {
		int A = a;
		int B = b; //A > B
		
		if(a < b) {
			A = b;
			B = a;
		}
		
		int r = A % B;
		if(A % B == 0) {
			return B;
		} else {
			return gcd(B, r);
		}
		
	}
}
