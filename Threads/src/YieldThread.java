
public class YieldThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YieldThread yt = new YieldThread();
		YieldThread1 yt1 = new YieldThread1();
		//below both are instance method
		yt.setDaemon(true);
		System.out.println(yt.isDaemon());
		//instance method
		yt.start();
		yt1.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			Thread.yield();
			System.out.println("yt:- " + i);
		}
	}

}

class YieldThread1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("yt1:- " + i);
		}
	}

}
