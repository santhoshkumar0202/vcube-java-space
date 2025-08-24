
public class Target_without_listandmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5, 6 };

		int target = 6;
		String seen = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] + arr[j] == target) {
					int min = Math.min(arr[i], arr[j]);
					int max = Math.max(arr[i], arr[j]);
					if (!seen.contains("" + min)) {
						seen += min;
						System.out.println(min + ":" + max);
					}
				}
			}
		}

	}

}
