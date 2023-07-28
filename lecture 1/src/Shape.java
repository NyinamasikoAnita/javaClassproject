
//Write a Java program to create a class called "Shape" with
//abstract methods for calculating area and perimeter,
//        and subclasses for "Rectangle", "Circle", and "Triangle".
public abstract class Shape {
    public abstract double getArea();

    public abstract double getPerimeter();


    public static void main(String[] args){
        Shape rectangle = new Rectangle1(20.5,15.6);
        Shape circle2 = new Circle2(30.4);
        Shape triangle = new Triangle(10,20,15);

        System.out.println("area of a rectangle:" + rectangle.getArea());
        System.out.println("perimeter of a rectangle:" + rectangle.getPerimeter());
        System.out.println("area of circle:" + circle2.getArea());
        System.out.println("perimeter of a circle:" + circle2.getPerimeter());
        System.out.println("area of a triangle:" + triangle.getArea());
        System.out.println("perimeter:" + triangle.getPerimeter());
    }
}