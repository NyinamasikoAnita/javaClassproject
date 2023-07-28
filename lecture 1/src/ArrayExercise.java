//PROGRAM TO CREATE AN ARRAY LIST ADD SOME ELEMENTS AND PRINT OUT THE COLLECTION.
import java.util.Collections ;
import java.util.List;
import java.util.ArrayList;

public class ArrayExercise {

    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("red");
        elements.add("black");
        elements.add("yellow");
        System.out.println(elements);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(8);
        System.out.println(numbers);

//        iterate through elements
        for (String i : elements) {
            System.out.println(i);
        }
//insert an element at a given position
        numbers.add(2, 3);
        System.out.println(numbers);

//        retrieve an element from a given array list.
        String color = elements.get(1);
        System.out.println("element at position 1 is :" + color);

//        updating an element
        numbers.set(3, 6);
        System.out.println("updated element is:" + numbers);
    }
}
//    sort a given array
