
class Resourse {

	int tickets;
	boolean status = false;

	public synchronized void put(int ticket) throws InterruptedException {
		while (status) {
			wait();
		}
		this.tickets = ticket;
		System.out.println("provided:-" + tickets);
		status = true;
		notify();
	}

	public synchronized void get() throws InterruptedException {
		while (!status) {
			wait();
		}
		System.out.println("consumed:-" + tickets);
		status = false;
		notify();
	}

}

class Provider extends Thread {
	Resourse r;

	Provider(Resourse r) {
		this.r = r;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				r.put(i);
				Thread.sleep(1000);
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
	}

}

class Consumer extends Thread {

	Resourse r;

	Consumer(Resourse r) {
		this.r = r;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				r.get();
				Thread.sleep(1000);
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
	}
}

public class MultiInterThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resourse r = new Resourse();
		Consumer c = new Consumer(r);
		Provider p = new Provider(r);

		p.start();
		c.start();

	}

}
