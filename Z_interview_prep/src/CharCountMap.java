import java.util.HashMap;
import java.util.Map;

public class CharCountMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java is simple in vcube";

		char[] ca = str.toCharArray();
		Map<Character, Integer> ma = new HashMap<Character, Integer>();

		for (char c : ca) {
			if (" ".equals(String.valueOf(c))) {
				continue;
			}
			if (ma.containsKey(c)) {
				ma.put(c, ma.get(c) + 1);
			} else {
				ma.put(c, 1);
			}
		}
		System.out.println(ma);

	}

}
