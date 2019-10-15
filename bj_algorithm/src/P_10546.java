
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class P_10546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
	    Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i = 0; i < n; i++){
            String input = sc.nextLine();
            map.put(input, 1);
        }
        
        for(int i = 0; i < n-1; i++){
            String input = sc.nextLine();
            if(map.containsKey(input)){
                map.put(input, map.get(input)+1);
            }
        }
        Set<Entry<String, Integer>> entry = map.entrySet();
        Iterator<Entry<String, Integer>> it = entry.iterator();
        
        while(it.hasNext()){
            Entry<String, Integer> e = it.next();
            if(e.getValue() % 2 == 1){
                System.out.println(e.getKey());
                break;
            }
        }
        
	}
}

