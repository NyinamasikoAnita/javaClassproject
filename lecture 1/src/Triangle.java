public class Triangle extends Shape {
    private double base;
    private double height;
    private double side;

    public Triangle(double base, double height, double side) {
        this.base = base;
        this.height = height;
        this.side= side;
    }

//    methods
    public double getArea(){
        return 1/2 * base* height;
    }

    public double getPerimeter(){
        return base+height+side;
    }
}
