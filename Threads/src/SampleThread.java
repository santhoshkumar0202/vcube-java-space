
public class SampleThread extends Thread {
	static int count = 0;
	String t;
	{
		count++;
		System.out.println("count:-" + count);
	}

	SampleThread(String c) {
		this.t = c;
	}

	public static void main(String[] arg) {
		SampleThread t = new SampleThread("t");
		SampleThread t1 = new SampleThread("t1");
		t.start();
		t1.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(t+"=" + i);
		}
	}

}
