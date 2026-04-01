interface Vehicle {
    void start();
    void seats();
    void tyres();
    void fuel();
}
abstract class TwoWheeler implements Vehicle {
    public void tyres() {
        System.out.println("Tyres: 2");
    }
}
class Bike extends TwoWheeler {
    public void start() {
        System.out.println("Bike starts with kick");
    }
    public void seats() {
        System.out.println("Seats: 2");
    }
    public void fuel() {
        System.out.println("Fuel: Petrol");
    }
}
class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with key");
    }
    public void seats() {
        System.out.println("Seats: 5");
    }
    public void tyres() {
        System.out.println("Tyres: 4");
    }
    public void fuel() {
        System.out.println("Fuel: CNG");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        Vehicle v2 = new Car();
        System.out.println("Bike Details:");
        v1.start();
        v1.seats();
        v1.tyres();
        v1.fuel();
        System.out.println("Car Details:");
        v2.start();
        v2.seats();
        v2.tyres();
        v2.fuel();
    }
}
