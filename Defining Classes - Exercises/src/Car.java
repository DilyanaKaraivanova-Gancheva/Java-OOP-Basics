public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostPerkm;
    private double distance;

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getFuelCostPerkm() {
        return fuelCostPerkm;
    }

    public double getDistance() {
        return distance;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelCostPerkm(double fuelCostPerkm) {
        this.fuelCostPerkm = fuelCostPerkm;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
