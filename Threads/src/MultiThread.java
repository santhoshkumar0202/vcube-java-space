
class ThreadSub extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println("sub : " + i);
		}
	}
}

class ThreadSub1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println("sub1 : " + i);
		}
	}
}

public class MultiThread extends Thread {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("main method");
		MultiThread t = new MultiThread();

		ThreadSub t1 = new ThreadSub();
		ThreadSub1 t2 = new ThreadSub1();
		t.start();
//		t.interrupt();
		
//		t1.start();
//		t2.start();
         
		for (int i = 0; i < 10; i++) {

			System.out.println("main : " + i);
		}

	}

	@Override
	public void run() {
		try {

		for (int i = 0; i < 10; i++) {

//			System.out.println("run : " + i);
			if(i>5) {
				Thread.currentThread().interrupt();
			}
				System.out.println("system multi:"+ i);
				Thread.sleep(1000);
				
				
				
		}
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


