class Bicycle extends Vehicle {
    private int maxSpeed;

    public Bicycle(String brand, int maxSpeed) {
        super(brand);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
}
