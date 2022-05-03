public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {return this.radius;}

    public void setRadius(double radius) {this.radius = radius;}

    @Override
    public void calculatePerimeter() {
        double circumference = 2 * Math.PI * getRadius();
        this.setShapePerimeter(circumference);
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * this.getRadius() * this.getRadius();
        this.setShapeArea(area);
    }
}
