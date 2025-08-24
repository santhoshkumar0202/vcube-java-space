import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_target_pair {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 3, 3, 7, -1, 3, 3 };
		int target = 6;
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

		for (int i : arr) {
			int comp = target - i;
			if (map.containsKey(comp) && !map.get(comp)) {
				System.out.println(comp + ":" + i);
//				map.put(i, true);
				map.put(comp, true);
			} else if (!map.containsKey(i)) {
				map.put(i, false);
			}
//			System.out.println("f");
		}
		System.out.println(map.get(5));
	}
}
