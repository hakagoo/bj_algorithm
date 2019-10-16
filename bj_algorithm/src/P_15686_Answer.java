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
			//����� ġŲ�� == ������ �ִ� ġŲ�� �̸�, ���ָ� �ּҰŸ����� ���� �� �þ
			//����, pick�� �ʿ���� �Ÿ����� ���� ���ϸ� �װ� �ּҰŸ��� ����
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
		} else { // ����� ġŲ�� < ������ �ִ� ġŲ��(ġŲ���� ������ m���� ũ�ų� ����)
			//�� ��쿡��, ġŲ������ ��� ������� ���� ��. 
			//��ü ġŲ�� ��(chicken.size)���� m������ �����ϴ� ����� ��
			//�ִ밪�� m���� �����ؾ� �Ÿ��� �ּҰ��̳���
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
