package MethodOverriding;

public class Square extends Rectangle1 {
   private double sideA;

    public Square(double sideA) {
        super(sideA);
        this.sideA = sideA;
    }

    @Override
    public double area() {
        return this.sideA * this.sideA;
    }
}
