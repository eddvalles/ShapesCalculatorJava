public class Triangle extends Shape {
    private double side_a;
    private double side_b;
    private double side_c;

    Triangle(double a, double b, double c) {
        side_a = a;
        side_b = b;
        side_c = c;
    }

    public double getSide_a() {return side_a;}

    public double getSide_b() {return side_b;}

    public double getSide_c() {return side_c;}

    @Override
    public void calculatePerimeter() {
        double perimeter = getSide_a() + getSide_b() + getSide_c();
        this.setShapePerimeter(perimeter);
    }

    @Override
    public void calculateArea() {
        double semiperimeter = (getSide_a() + getSide_b() + getSide_c()) / 2; // Calculates the semiperimeter of the sides

        // Calculates the area of the triangle
        double area = (int) Math.sqrt(semiperimeter * (semiperimeter-getSide_a())
                * (semiperimeter-getSide_b())
                * (semiperimeter-getSide_c()));

        this.setShapeArea(area);
    }
}
