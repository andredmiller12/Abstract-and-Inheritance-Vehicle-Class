 class Car extends Vehicle {
    private int maxSpeed;

    public Car(String brand, int maxSpeed) {
        super(brand);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
}
