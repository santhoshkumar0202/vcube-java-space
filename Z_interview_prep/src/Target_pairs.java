import java.lang.foreign.AddressLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Target_pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		List<Integer> li = new ArrayList<>();

		int arr[] = { 3, 4,4, 5, 2, 5, 1 };
		int target = 7;

		String s = "";
		Integer i = new Integer(10);
		for (Integer l : arr) {
			if (l < target || l > target) {
				// compliment storing in res
				// 6-3=3,6-3=3,6--3,
				int res = target - l;
//System.out.println("res: "+res);
				if (li.contains(res)) {
					int min = Math.min(l, res);
					int max = Math.max(l, res);
					if (!s.contains("" + min)) {
						s += "" + min;
						System.out.println(min + " : " + max);
					}

				} else {
					li.add(l);
//					System.out.println(res + "added");
				}
//System.out.println(3-(-3));
			}
		}

	}

}
