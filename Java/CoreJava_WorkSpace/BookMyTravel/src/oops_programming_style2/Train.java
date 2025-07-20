package oops_programming_style2;

public class Train {
	public static String boardingPoint = "KACHEGUDA";
    public String destinationPoint;
    public String trainName;
    public double speed;
    public double distance;
    public String trainNumber;

    public void destination(String str,double d) {
    	destinationPoint = str;
    	trainNumber = boardingPoint.substring(0, 3)+ (int)destinationPoint.charAt(0)/10+(int)destinationPoint.charAt(1)/10+(int)destinationPoint.charAt(2)/10;
    	trainName = destinationPoint+" EXPRESS";
    	distance = d;
    }
    public void speed(int s) {
    	speed = s;
    }
    public double travelTime() {
    	double timeInHrs = distance/speed;
    	return timeInHrs;
    }
    public void display() {
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
