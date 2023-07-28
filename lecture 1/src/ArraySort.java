
import java.util.Arrays;
public class ArraySort {
    public static void main(String[] args){
        int [] my_array1= {1,1,10,20,2};

        String [] my_array2 = {"chloe", "moses", "anita","pincess"};

        System.out.println("original int array:" + Arrays.toString(my_array1) );
        Arrays.sort(my_array1);
        System.out.println("sorted array: " + Arrays.toString(my_array1));

        System.out.println("original string array:" + Arrays.toString(my_array2));
        Arrays.sort(my_array2);

        System.out.println("sorted string array:" + Arrays.toString(my_array2));


//        printing the sum of an array using for each loop.
        int sum = 0;
        for (int i : my_array1)
            sum +=i;
        System.out.println("the sum is " + sum);

//        printing the average of elements in an array

        int sum1 = 0;
        for (int i = 0; i< my_array1.length; i++)
            sum1 = sum1 + my_array1[i];
        System.out.println("sum is:" + sum1);

//        calculate the average
        double average = sum1/ my_array1.length;
        System.out.println(average);


    }
}
