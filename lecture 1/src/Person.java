public class Person {
//    class attributes.
        String studentName;
        int studentAge;

//        constructor
        public Person(String name, int age){
            studentName= name;
            studentAge = age;
        }

//        instances of a class.
        public static void main(String[] args){
            Person student1 = new Person("Anita" , 22);
            Person student2 = new Person("christine", 21);
            System.out.println(student1.studentName  +  " " + student1.studentAge);
            System.out.println(student2.studentName + " " + student2.studentAge);
        }
    }
