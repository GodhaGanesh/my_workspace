package oops_programming_style1;

public class Train {
	public static String boardingPoint = "KACHEGUDA";
	public String destinationPoint;
	public String trainName;
	public double speed;
	public double distance;
	public String trainNumber;

	public static void main(String[] args) {
		Train train1 = new Train();
		Train train2 = new Train();
		train1.destinationPoint = "VISHAKAPATNAM";
		train1.trainName = train1.destinationPoint + " EXPRESS";
		train1.speed = 80;
		train1.distance = 567;
		train1.trainNumber = boardingPoint.substring(0, 3) + (int) train1.destinationPoint.charAt(0) / 10
				+ (int) train1.destinationPoint.charAt(1) / 10 + (int) train1.destinationPoint.charAt(2) / 10;
		train2.destinationPoint = "TIRUPATHI";
		train2.trainName = train2.destinationPoint + " Express";
		train2.speed = 60;
		train2.distance = 784;
		train2.trainNumber = boardingPoint.substring(0, 3) + (int) train2.destinationPoint.charAt(0) / 10
				+ (int) train2.destinationPoint.charAt(1) / 10 + (int) train2.destinationPoint.charAt(2) / 10;
		System.out.println("----------- " + train1.trainName + " -----------");
		System.out.println(" Train No. : "+train1.trainNumber);
    	System.out.println(" From : "+boardingPoint);
    	System.out.println(" To   : "+train1.destinationPoint);
    	System.out.println(" distance : "+train1.distance);
    	System.out.println(" speed : "+train1.speed);
    	System.out.println(" Time : "+train1.distance/train1.speed+" Hrs (or) "+train1.distance/train1.speed*60+" Mins");
    	
    	System.out.println("----------- " + train2.trainName + " -----------");
		System.out.println(" Train No. : "+train2.trainNumber);
    	System.out.println(" From : "+boardingPoint);
    	System.out.println(" To   : "+train2.destinationPoint);
    	System.out.println(" distance : "+train2.distance);
    	System.out.println(" speed : "+train2.speed);
    	System.out.println(" Time : "+train2.distance/train2.speed+" Hrs (or) "+train2.distance/train2.speed*60+" Mins");

	}
}
