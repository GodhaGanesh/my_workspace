package exercise6;

class Figure_3D{
    public void calculateVolume(){
        System.out.println("Volume not defined");
    }
    public void display(){
        System.out.println("This is a 3D Figure");
    }
}

class Cylinder extends Figure_3D{
    double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void calculateVolume() {
        double volume = Math.PI * radius * radius * height;
        System.out.printf("Cylinder Volume: %.2f\n",volume);
    }

    @Override
    public void display() {
        System.out.println("This is a Cylinder.");
    }
}

class Cone extends Figure_3D{
    double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void calculateVolume() {
        double volume = (1.0/3)*Math.PI * radius * radius * height;
        System.out.printf("Cone Volume: %.2f\n",volume);
    }

    @Override
    public void display() {
        System.out.println("This is a Cone.");
    }
}

class Sphere extends Figure_3D{
    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateVolume() {
        double volume = (4.0/3)*Math.PI * radius * radius * radius;
        System.out.printf("Sphere Volume: %.2f\n",volume);
    }

    @Override
    public void display() {
        System.out.println("This is a Sphere.");
    }
}

public class MainClass1 {
    public static void main(String[] args){
        Figure_3D fig[] = new Figure_3D[3];
        fig[0] = new Cylinder(3,5);
        fig[1] = new Cone(3,5);
        fig[2] = new Sphere(3);

        for(Figure_3D f : fig){
            f.display();
            f.calculateVolume();
            System.out.println("----------------------");
        }
    }
}
