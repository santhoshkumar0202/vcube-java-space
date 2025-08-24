import java.util.ArrayList;
import java.util.List;

public class ThreadDemo extends Thread {
	//3 steps 1) must extend thread or runable 2)must override run method  3) intantiate the obj and call start instance method

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
	

		ThreadDemo tr = new ThreadDemo();
		tr.start();
		for (Integer integer : list) {
			System.out.println(integer);
		}

	}

	@Override
	public void run() {
		List<String> list_run = new ArrayList<String>();
		System.out.println("********************************run");
		list_run.add("hello");
		list_run.add("bolo");
		list_run.add("kalo");
		list_run.add("lelo");
		list_run.add("hello dalo");
		System.out.println("********************************run end");
		for (String str : list_run) {
			System.out.println(str);

		}

	}

}
