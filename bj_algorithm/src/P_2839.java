import java.util.Scanner;

public class P_2839 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 5;
        int b = n % 5;
        
        if(n == 3) System.out.println(1);
        if(n == 4) System.out.println(-1);
        if(n >= 5) {
            while(true){
                if(b % 3 == 0){
                    System.out.println(a + (b/3));
                    break;
                } else {
                    a--;
                    b += 5;
                }
                if(a == 0 && (b%3) != 0){
                    System.out.println(-1);
                    break;
                }
            }
        }
    } 
}