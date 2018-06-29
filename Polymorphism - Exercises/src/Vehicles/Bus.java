package Vehicles;

public class Bus extends Vehicles {


    public Bus(double fuelQuantity, double litterPerkm, double tankCapacity) {
        super(fuelQuantity, litterPerkm, tankCapacity);
    }

    @Override
    protected void drive(double distance) {
        double consumption = distance * (this.getLitterPerkm() + 1.4);
        if (consumption > this.getFuelQuantity()) {
            throw new IllegalArgumentException("Bus needs refueling");
        } else {
            this.setFuelQuantity(this.getFuelQuantity() - consumption);
        }
    }

    protected void driveEmpty(double distance) {
        double consumption = distance * (this.getLitterPerkm());
        if (consumption > this.getFuelQuantity()) {
            throw new IllegalArgumentException("Bus needs refueling");
        } else {
            this.setFuelQuantity(this.getFuelQuantity() - consumption);
        }
    }

    @Override
    protected void refuel(double littres) {
        if (littres <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if (this.getTankCapacity() < this.getFuelQuantity() + littres) {

            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.setFuelQuantity(this.getFuelQuantity() + littres);
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f%n", this.getClass().getSimpleName(), this.getFuelQuantity());
    }
}
