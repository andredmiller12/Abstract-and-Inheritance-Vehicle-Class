abstract class Vehicle {
    private String brand;

    protected Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract int getMaxSpeed();


    public void displayInfo() {
        System.out.println("This is a " + brand + " vehicle.");
    }
