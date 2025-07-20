package oops_programming_style3;

public class DriverClass {
	public static void main(String[] args) {
        Train train1 = new Train();
        Train train2 = new Train(); 
        Train train3 = new Train();
        train1.destination("VISHAKAPATNAM",567.4);
        train1.speed(80);
        train2.destination("TIRUPATHI",784.6);
        train2.speed(60);
        train1.display();
        train2.display();
        train3.destination("VIJAYAWADA",630.45);
        train3.speed(90);
        train3.display();
    }
}
