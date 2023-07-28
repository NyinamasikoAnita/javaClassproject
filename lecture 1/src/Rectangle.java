
//creating class Rectangle.

public class Rectangle {

//    attributes of class.
    private double width;
    private double height;

//    constructor of initializing the instance of a class.
   public Rectangle( double width,  double height){
       this.width= width;
       this.height = height;
   }

//   method to set the height.
    public void setHeight(double height) {
        this.height = height;
    }

//    method to set the width.
    public void setWidth(double width) {
        this.width = width;
    }

//    method to get the width of the rectangle.
    public double getWidth(){
        return width;
    }

//    method to get the height of the rectangle.

    public double  getHeight() {
        return height;
    }

//    method to get the area of the rectangle.
    public double  getArea (){
        return width * height;
    }

//    method to get the perimeter of the rectangle.
    public double getPerimeter(){
        return 2 * (width + height);
    }


    public static void main(String[] args){
//       creating an instance of a class.
       Rectangle rect1= new Rectangle(10,20);
        System.out.println("width :" + " " + rect1.width);
        System.out.println("height:" + " " + rect1.height);

//        modifying the width and height values by calling the setters and getters.
       rect1.setWidth(20);
       rect1.setHeight(30);
        System.out.println("width :" + " " + rect1.getWidth());
        System.out.println( "Height :" + " " + rect1.getHeight());

//        printing the area and perimeter of the rectangle.
        System.out.println( "Area " + "= " +rect1.getArea());
        System.out.println( "perimeter " + "= "  + rect1.getPerimeter());
    }
}