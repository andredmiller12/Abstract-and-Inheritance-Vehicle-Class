public class AbstractVehicles {
    public static void main(String[] args) {
        Vehicle v1 = new Car("Toyota", 180);
        Vehicle v2 = new Bicycle("Giant", 30);

        v1.displayInfo();
        System.out.println("Car max speed: " + v1.getMaxSpeed() + " km/h");

        v2.displayInfo();
        System.out.println("Bicycle max speed: " + v2.getMaxSpeed() + " km/h");
    }
}
