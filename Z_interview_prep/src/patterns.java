
public class patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			  int num = 2 + (i - 1) * 4;
			for (int j = 0; j <= i; j++) {
//				int num = (j + i+1)*4;
				System.out.print(num + " ");
			
			}
			System.out.println();
		}
	}

}
