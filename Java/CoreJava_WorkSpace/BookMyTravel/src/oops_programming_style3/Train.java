package oops_programming_style3;

public class Train {
	private static String boardingPoint = "KACHEGUDA";
    private String destinationPoint;
    private String trainName;
    private double speed;
    private double distance;
    private String trainNumber;
    
    public static String generateTrainNumber(String destination) {
    	destination = destination.toUpperCase();
    	
        int d1 = (int) destination.charAt(0)/ 10;
        int d2 = (int) destination.charAt(1)/ 10;
        int d3 = (int) destination.charAt(2)/ 10;

        return  boardingPoint.substring(0,3)+ d1 + d2 + d3;
	}

    public void destination(String destinationPoint,double distance) {
    	if (TrainValidation.verifyDestination(destinationPoint)&&TrainValidation.verifyDistance(distance)) {
			this.destinationPoint = destinationPoint;
			this.distance = distance;
			trainName = destinationPoint+" EXPRESS";
			this.trainNumber = generateTrainNumber(destinationPoint);
		}
    	else
    		System.err.println("invalid Details");
    }
    public void speed(int speed) {
    	if (TrainValidation.verifySpeed(speed)) {
			this.speed = speed;
		}
    	else
    		System.err.println("invalid speed !!");
    }
    public double travelTime() {
    	return distance/speed;
    }
    public void display() {
    	if (this.destinationPoint == null) {
			return;
		}
    	System.out.println("-------------------------------------");
    	System.out.println("            "+trainName);
    	System.out.println("-------------------------------------");
    	System.out.println(" Train No. : "+trainNumber);
    	System.out.println(" From : "+boardingPoint);
    	System.out.println(" To   : "+destinationPoint);
    	System.out.println(" distance : "+distance);
    	System.out.println(" speed : "+speed);
    	System.out.println(" Time : "+travelTime()+" Hrs (or) "+travelTime()*60+" Mins");
    }
}
