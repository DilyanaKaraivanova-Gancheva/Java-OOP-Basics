package Shape;

abstract class Shape {
    private double perimeter;
    private  double area;

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    protected abstract double calculatePerimeter();
    protected abstract double calculateArea();
}
