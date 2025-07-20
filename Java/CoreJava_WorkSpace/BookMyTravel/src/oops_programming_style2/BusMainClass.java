package oops_programming_style2;

public class BusMainClass {
	public static void main(String[] args) {
		Bus bus1 = new Bus();
		Bus bus2 = new Bus();
		Bus bus3 = new Bus();
		
		bus1.newBus("Red Bus", "AP 35 IG 6786", "HYD", "VSKP", 897.65);
		bus2.newBus("APSRTC", "AP 32 Z 5980", "VIJAYAWADA", "RAJAMUNDRY", 678.54);
		bus3.newBus("TGRTC", "TG 37 Z 8989", "HYD", "BZA", 789.52);
		
		bus1.bookTicket(5);
		bus1.bookTicket(2);
		bus2.bookTicket(45);
		bus2.bookTicket(6);
		bus3.bookTicket(55);
		bus3.bookTicket(2);
		
		bus1.display();
		bus2.display();
		bus3.display();
		System.out.println("Total Amount Collected : "+Bus.collection);
	}
}
