package Vehicles;

abstract class Vehicles {
    private double fuelQuantity;
    private double litterPerkm;
    private double tankCapacity;

    public Vehicles(double fuelQuantity, double litterPerkm, double tankCapacity) {
        this.setFuelQuantity(fuelQuantity);
        this.setLitterPerkm(litterPerkm);
        this.setTankCapacity(tankCapacity);
    }

    public double getTankCapacity() {
        return this.tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {

            this.tankCapacity = tankCapacity;
    }

    public double getFuelQuantity() {
        return this.fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {

            this.fuelQuantity = fuelQuantity;
    }

    public double getLitterPerkm() {
        return litterPerkm;
    }

    public void setLitterPerkm(double litterPerkm) {
        this.litterPerkm = litterPerkm;
    }
    protected abstract void drive ( double distance);
    protected abstract void refuel ( double littres);
}
