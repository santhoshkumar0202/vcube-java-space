import java.security.Identity;

public class SleepJoinYield implements Runnable {
	public static void main(String[] args) {
		SleepJoinYield t = new SleepJoinYield();
		Thread th = new Thread(t);

		System.out.println("main method");
		th.start();
//	th.interrupt();
		for (int i = 0; i < 10; i++) {
			System.out.println("main:" + i);
		}
	}

	@Override
	public void run() {
		try {
			// TODO Auto-generated method stub
			for (int i = 0; i < 10; i++) {
				System.out.println("run:" + i);
				if (i > 1) {
					Thread.currentThread().interrupt();
				}
				Thread.sleep(10000);

			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println();
			e.printStackTrace();
		}
	}
}
