package Vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicles{

    public Truck(double fuelQuantity, double litterPerkm,double tankCapacity) {
        super(fuelQuantity, litterPerkm, tankCapacity);
    }

    @Override
    protected void drive(double distance) {
        double consumption = distance * (this.getLitterPerkm() + 1.6);
        if ( consumption > this.getFuelQuantity()){
            throw new IllegalArgumentException("Truck needs refueling");
        }else{
            this.setFuelQuantity(this.getFuelQuantity() - consumption);
        }
    }

    @Override
    protected void refuel(double littres) {
        if (littres <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if (this.getTankCapacity() < this.getFuelQuantity() + (littres - littres * 0.05)) {

            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }

        this.setFuelQuantity(this.getFuelQuantity() + (littres - littres * 0.05));
    }
    @Override
    public String toString(){

        return String.format("%s: %.2f",this.getClass().getSimpleName(),(this.getFuelQuantity()) );
    }
}
