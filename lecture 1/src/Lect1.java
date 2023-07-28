import java.util.Arrays;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Lect1 {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");


        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
//   primitive data types.
        byte byte_type =127;
        short short_type = 32_762;
        int int_type = 2_000_000_000;
        long long_type = 3_000_000_000L;
        double double_type = 4.22;
        float float_type = 4.22F;

        System.out.println(byte_type);

//     non-primitive data types or reference types.(used for storing complex
//        data eg mail messages.

//        function to generate today's date.
        Date now = new Date();
        System.out.println(now);


//        strings (methods)

        String name = "anita millicent";

//        checking if a string starts or ends with some characters.(returns boleans)
        System.out.println(name.endsWith("nt"));
        System.out.println(name.startsWith("n"));

//        checking if a certain character or word exists in a string.
        System.out.println(name.indexOf("i"));

//        replacing a character.
        System.out.println(name.replace("a","A"));

//        length of a string(RETURNS THE NUMBER OF ITEMS IN A STRING)
        System.out.println(name.length());

//        concatenating a string.
        String firstName = "princess";
        String lastName = "  christine";
        System.out.println(firstName.concat(lastName));

//        to lowercase
        String school = "WITU";
        System.out.println(school.toLowerCase());


//        ARRAYS AND ARRAY METHODS.
        int[] numbers = {2,3,5,1,4};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        String[] names = {"anita","kiyoo", "kaprinch","kabeere"};
        Arrays.sort(names); 
        System.out.println(Arrays.toString(names));


//      IF ELSE
         int age= 18;
         int age2= 30;
         if (age > age2){
             System.out.println("your too old");
         }
         else if(age <= age2){
             System.out.println("your the perfect match");
         }
         else{
             System.out.println("relax");
         }

//         TENARY OPERATOR
        int time = 20;
         String result = (time < 18) ? "Good day" : "Good evening";
         System.out.println(result);

//         SWITCH STATEMENT
        int day = 4;
        switch(day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                 break;
            default:
                System.out.println("sunday");

        }

//        LOOPS
//        WHILE LOOP
        int x = 0;
        while (x<5){
            System.out.println(x);
            x++;
    }



}

}