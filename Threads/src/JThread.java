
class JThread1 extends Thread {
	JThread2 th2;

	JThread1(JThread2 j2) {
		this.th2 = j2;

	}

	@Override
	public void run() {
		int sum = 0;
		for (int i = 50; i < 100; i++) {
			if (i == 75) {
				try {
					// instance method throws interrrupted exception
					th2.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			sum += i;
			System.out.println("j1:-" + i);
		}

		System.out.println("j1 sum:-" + sum);

	}

}

class JThread2 extends Thread {
	@Override
	public void run() {
		int sum = 0;
		for (int i = 50; i < 100; i++) {
			sum += i;
			System.out.println("j2:-" + i);
		}

		System.out.println("j2 sum:" + sum);

	}
}

public class JThread extends Thread {

	static public void main(String args[]) {
		JThread j = new JThread();
		JThread2 j2 = new JThread2();
		JThread1 j1 = new JThread1(j2);

		j.start();
		j1.start();
		j2.start();

	}

	@Override
	public void run() {
		int sum = 0;
		for (int i = 50; i < 100; i++) {
			sum += i;
			System.out.println("j:-" + i);
		}

		System.out.println("j sum:" + sum);
	}

}
