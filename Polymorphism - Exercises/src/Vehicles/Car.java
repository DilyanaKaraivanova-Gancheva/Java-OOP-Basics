package Vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicles{

    public Car(double fuelQuantity,double litterPerkm,double tankCapacity) {
        super(fuelQuantity, litterPerkm, tankCapacity);
    }

    @Override
    protected void drive(double distance) {
        double consumption = distance * (this.getLitterPerkm() + 0.9);
        if ( consumption > this.getFuelQuantity()){
            throw new IllegalArgumentException("Car needs refueling");
        }else{
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
    public String toString(){

        return String.format("%s: %.2f",this.getClass().getSimpleName(),(this.getFuelQuantity()) );
    }
}
