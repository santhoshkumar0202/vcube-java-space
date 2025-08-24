
public class Charcount {
	public static void main(String[] args) {
//		System.out.println("main method started");
		String str = "aabbcccdddddds";
		char pre = str.charAt(0);
		String result = "";
		int count = 1;

		for (int i = 1; i < str.length(); i++) {
			System.out.println(pre);
			if (pre == str.charAt(i)) {
				count++;

			} else {
				result += pre + "" + count;
				count = 1;
				pre = str.charAt(i);
			}

		}
		result += pre + "" + count;
		System.out.println(result);
	}
}
