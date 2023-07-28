public class Vehicle {
//    CLASS ATTRIBUTES
    String name = "Benz";
    String model = "300";
    String color = "red";

//    CLASS METHODS
    static void myMethod(){
        System.out.println("hello world");
    }
    public int carNumber(int g){
        return g;

    }

    public static void main (String[] args){
        Vehicle car = new Vehicle();
        myMethod();
        System.out.println(car.carNumber(6));

    }

   }