import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//creating class Circle.
public class Circle {

//    creating class attributes.
    private double radius;


//    constructor for initialising object of a class
    public Circle(double radius){
        this.radius = radius;
    }

//    method to set the radius
    public void setRadius(double radius){
        this. radius = radius;
    }

//    method to get the radius
    public double getRadius(){
        return radius;
    }

//    method to find the area of a circle
    public double getArea(){
        return 3.14*radius*radius;
    }

//    method to get the circumference of a circle
    public double getCircumference(){
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args){

//        creating an instance of a class.
        Circle newRadius = new Circle(50);

//        calculating the area of the circle.
        System.out.println("Radius = " + " " + newRadius.getArea());

//        calculating the circumference of the circle
        System.out.println("circumference = " + " " + newRadius.getCircumference() );


//        modifying the object attributes.

        newRadius.setRadius(20);
        System.out.println("new radius = " + " " + newRadius.getArea());

//        accessing the object attributes.
        System.out.println(newRadius.getRadius());

//        use of scanner for user input.
////        Scanner myObj = new Scanner(System.in);
////        System.out.println("enter name, age and salary:");
////
//////        string input
////        String name = myObj.nextLine();
////
//////        numerical input
////        int age = myObj.nextInt();
////        double salary = myObj.nextDouble();
////
//////        output input by user
////        System.out.println("name:" + name);
////        System.out.println("age:" + age);
////        System.out.println("salary:" + salary);
////
////        //   date and time
////        LocalDate myObj1 = LocalDate.now();
////        System.out.println(myObj1);
////
////        LocalTime myObj2 = LocalTime.now();
////        System.out.println(myObj2);
////
////        formatting date and time
//        LocalDateTime myDateObj = LocalDateTime.now();
//        System.out.println("before formatting:" + myDateObj);
//
////        ofPattern() method accepts all sorts of values, if you want to display the date
////        and time in a different format.
//        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E,dd/MM/yy  HH:mm:ss");
//
//        String formattedDate = myDateObj.format(myFormatObj);
//        System.out.println("after formatting:" + formattedDate);

    };





}