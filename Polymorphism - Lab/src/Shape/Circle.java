package Shape;

public class Circle extends  Shape{
    private double radius;

    public Circle(double radius) {
        this.setRadius(radius);
    }

    final double getRadius() {
        return radius;
    }

    final void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected double  calculatePerimeter() {
        return ((2 * Math.PI * this.getRadius()));
    }

    @Override
   protected double calculateArea() {
        return Math.PI * this.getRadius() * this.getRadius();
    }
}
