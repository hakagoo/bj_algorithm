import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P_15686_Answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Address> house = new ArrayList<Address>();
		List<Address> chicken = new ArrayList<Address>();
		int result = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int a = sc.nextInt();
				if (a == 1) {
					house.add(new Address(i, j));
				}
				if (a == 2) {
					chicken.add(new Address(i, j));
				}
			}
		}

		if (m == chicken.size()) { 
			//살려둘 치킨집 == 마을에 있는 치킨집 이면, 없애면 최소거리들의 합이 더 늘어남
			//따라서, pick할 필요없이 거리들의 합을 구하면 그게 최소거리의 합임
			for (Address h : house) {
				int min = 0;
				for (Address c : chicken) {
					int tmp = c.distance(h);
					if (min == 0 || min > tmp) {
						min = tmp;
					}
				}
				result += min;
			}
			System.out.println(result);
		} else { // 살려둘 치킨집 < 마을에 있는 치킨집(치킨집은 어차피 m보다 크거나 같다)
			//이 경우에는, 치킨집에서 어디를 폐업할지 골라야 함. 
			//전체 치킨집 수(chicken.size)에서 m가지를 선택하는 경우의 수
			//최대값인 m개를 선택해야 거리가 최소값이나옴
			ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
			pick(chicken.size(), new ArrayList<Integer>(), m, arr);
			for (ArrayList<Integer> a : arr) {
				List<Address> pickedChicken = new ArrayList<Address>();
				for (int b : a) {
					pickedChicken.add(chicken.get(b));
				}

				int gMin = 0;
				for (Address h : house) {
					int min = 0;
					for (Address c : pickedChicken) {
						int tmp = c.distance(h);
						if (min == 0 || min > tmp) {
							min = tmp;
						}
					}
					gMin += min;
				}
				if (result == 0 || result > gMin) {
					result = gMin;
				}
			}
			System.out.println(result);
		}
	}

	static void pick (int n, ArrayList<Integer> picked, int toPick, ArrayList<ArrayList<Integer>> collection) {
		if (toPick == 0) {
			collection.add(picked);
			return;
		}

		int smallest = picked.isEmpty() ? 0 : picked.get(picked.size() - 1) + 1;

		for (int next = smallest; next < n; next++) {
			picked.add(next);
			pick(n, new ArrayList<Integer>(picked), toPick - 1, collection);
			picked.remove(picked.size() - 1);
		}
	}
}

class Address {
	int x;
	int y;

	Address(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int distance(Address target) {
		return Math.abs(target.x - this.x) + Math.abs(target.y - this.y);
	}
}
