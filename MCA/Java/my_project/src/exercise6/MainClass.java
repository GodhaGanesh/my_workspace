package exercise6;

class Vehicle{
    public String vehicleType;
    public Vehicle(String vehicleType){
        this.vehicleType = vehicleType;
    }
}

class Brand extends Vehicle{
    public String brandName;
    public Brand(String vehicleType, String brandName){
        super(vehicleType);
        this.brandName = brandName;
    }
}

class Cost extends Brand{
    double price;

    public Cost(String vehicleType, String brandName, double price) {
        super(vehicleType, brandName);
        this.price = price;
    }
    public void displayDetails(){
        System.out.println("VehicleType: "+vehicleType);
        System.out.println("BrandName: "+brandName);
        System.out.println("Cost: ₹"+price);
    }
}
public class MainClass {
    public static void main(String[] args) {
        Cost c = new Cost("Car", "Mahindra", 1500000);
        c.displayDetails();
    }
}
