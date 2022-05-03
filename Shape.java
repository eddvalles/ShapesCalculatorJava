public abstract class Shape {
    private double shapePerimeter;
    private double shapeArea;

    // Getters and setters for private attributes of Shape
    public double getShapePerimeter() {return shapePerimeter;}

    public double getShapeArea() {return shapeArea;}

    public void setShapePerimeter(double shapePerimeter) {this.shapePerimeter = shapePerimeter; }

    public void setShapeArea(double shapeArea) {this.shapeArea = shapeArea;}

    // Abstract calculations that will need to implemented in objects that inherit from this class
    public abstract void calculatePerimeter();

    public abstract void calculateArea();

}
