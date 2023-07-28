
//question 1

//java program to swap two numbers.

public class SwapNumbers{

    public static void main(String[] args) {

        int a = 500, b= 100;

        System.out.println("--Before swap--");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Value of a is assigned to c
        int c= a;

        // Value of b is assigned to a
        a = b;

        // Value of c (which contains the initial value of a) is assigned to b
        b= c;

        System.out.println("--After swap--");
        System.out.println("a  = " + a);
        System.out.println("b  = " + b);



//
    }
}