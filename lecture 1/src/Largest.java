//question 2
//        Write a Java program to find the largest of 3 numbers.

public class Largest {




    public static void main(String[] args) {

        int n1 = 10, n2 = 50, n3 = 30;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");

        System.out.println("hello" + "\nANITA");
        System.out.println(n1+n2);


    }
}