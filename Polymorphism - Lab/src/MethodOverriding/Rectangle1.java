package MethodOverriding;

public class Rectangle1 {
    private double sideA;
    private  double sideB;

    public Rectangle1(double sideA){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle1(double sideA, double sideB) {
        this(sideA);
        this.sideB = sideB;
    }

    public double area(){
        return this.sideA * this.sideB;
    }

    public double getSideA() {
        return sideA;
    }
}
