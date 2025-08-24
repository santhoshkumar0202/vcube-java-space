
public class MyThreadPri extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method ");
MyThreadPri t=new MyThreadPri();
t.start();

Thread.currentThread().setName("hello");
System.out.println(Thread.currentThread());
for (int i = 0; i < 10 ; i++) {
	System.out.println("main:"+i);
}
	}

@Override
public void run() {
	// TODO Auto-generated method stub
	Thread.currentThread().setPriority(MAX_PRIORITY);

	Thread.currentThread().setName("run");
	System.out.println(Thread.currentThread());
	for (int i = 0; i < 10 ; i++) {
		System.out.println("run:"+i);
	}
	
}
}
