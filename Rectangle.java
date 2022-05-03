public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {return length;}

    public double getWidth() {return width;}

    @Override
    public void calculatePerimeter() {
        double perimeter = (this.getLength() * 2) + (this.getWidth() * 2);
        this.setShapePerimeter(perimeter);
    }

    @Override
    public void calculateArea() {
        double area = this.getLength() * this.getWidth();
        this.setShapeArea(area);
    }

}
