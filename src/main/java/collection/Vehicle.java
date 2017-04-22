/**
 * Created by asus on 2017/3/15.
 */

/*public class Vehicle {

    String name;
    double weight;
    double price;
    char   color;

    public Vehicle(String name) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.color = color;
    }

    public void start(){
        System.out.println("Vehicle is starting");
    }
    public void stop(){
        System.out.println("Vehicle is stopped");
    }
}
class Bicycle extends Vehicle{
    String type;

    public Bicycle(String name, double weight, double price, char color, String type) {
        super(name);
        this.type = type;
    }

    public Bicycle() {
        super();
    }


    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("car")
        System.out.println(vehicle.weight);
        vehicle.start();
        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.weight);
        bicycle.start();
    }

   /* class Ship extends Bicycle {
    public Ship(String name, double weight, double price, char color, String type) {
        super(name, weight, price, color, type);
    }

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.weight);
        bicycle.start();
        Ship ship = new Ship();
        System.out.println(bicycle.weight);
        bicycle.start();

    }
}


*/