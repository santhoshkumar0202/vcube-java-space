
class BookingManagement {
	int tickets = 15;

	synchronized void get(int seats) {

		if (seats <= tickets) {
			System.out.println("you have booked " + seats + " tickets");
			tickets -= seats;
			System.out.println("remaining avaliable tickets :" + tickets + " tickets");

		} else {
			if (tickets > 0) {
				System.out.println(" Book valid Seats");
				System.out.println(" Availabe Seats are :" + tickets);

			} else {
				System.out.println(" tickets are soldout");
			}

		}
	}
}

public class BookMysShow extends Thread {

	BookingManagement bms;
	int seats;

	BookMysShow(BookingManagement bms) {
		this.bms = bms;
	}

	@Override
	public void run() {

		bms.get(seats);

	}

	public static void main(String[] args) {

		BookingManagement bms = new BookingManagement();
		BookMysShow t1 = new BookMysShow(bms);
		BookMysShow t2 = new BookMysShow(bms);

		t1.seats = 4;
		t1.start();
		t2.seats = 15;
		t2.start();
	}

}
