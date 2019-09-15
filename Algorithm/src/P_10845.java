import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P_10845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i = 0; i < n; i++) {
			String[] command = sc.nextLine().split(" ");
			switch (command[0]) {
			case "push":
				queue.offer(Integer.parseInt(command[1]));
				break;
			case "pop":
				System.out.println(queue.isEmpty() ? -1 : queue.poll());
				break;
			case "size":
				System.out.println(queue.size());
				break;
			case "empty":
				System.out.println(queue.isEmpty() ? 1 : 0);
				break;
			case "front":
				System.out.println(queue.isEmpty() ? -1 : queue.peek());
				break;
			case "back":
				Object[] tmp = queue.toArray();
				if(queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println((int)tmp[queue.size()-1]);
				}
				break;

			default:
				break;
			}
		}
	}
}
