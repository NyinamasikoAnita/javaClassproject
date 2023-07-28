//question 3

//Write a Java program to find the factorial of a number.
//the factorial of a number is the multiplication of all the numbers between 1 and the number itself.

public class Factorial {

    public static void main(String[] args) {

        int num = 10;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}