import java.util.Arrays;
import java.util.Scanner;

public class P_1296{
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String ms = sc.nextLine();
        int N = Integer.parseInt(sc.nextLine());
        String[] names = new String[N];
        int[] resultSet = new int[N];
        //OHMINSIK
        for(int i = 0; i < N; i++) {
        	names[i] = sc.nextLine();        	
        }
        
        Arrays.sort(names);
        
        for(int i = 0; i < N; i++){
            int L = 0;
            int O = 0;
            int V = 0;
            int E = 0;
            
            for(int j = 0; j < ms.length(); j++) {
            	if(ms.charAt(j) == 'L') {
            		L++;
            	}
            	else if(ms.charAt(j) == 'O') {
            		O++;
            	}
            	else if(ms.charAt(j) == 'V') {
            		V++;
            	}
            	else if(ms.charAt(j) == 'E') {
            		E++;
            	}
            }
            
            for(int j = 0; j < names[i].length(); j++){
                if(names[i].charAt(j) == 'L'){
                    L++;
                } else if(names[i].charAt(j) == 'O'){
                    O++;
                } else if(names[i].charAt(j) == 'V'){
                    V++;
                } else if(names[i].charAt(j) == 'E'){
                    E++;
                }
            }
            resultSet[i] = calculator(L, O, V, E);
        }
        
        int max = resultSet[0];
        int maxIdx = 0;
        for(int i = 0; i < N; i++) {
        	if(resultSet[i] > max) {
        		max = resultSet[i];
        		maxIdx = i;
        	}
        }
        System.out.println(names[maxIdx]);
        
        
     }
     
     public static int calculator(int L, int O, int V, int E){
        return ((L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E)) % 100;
     }
}
