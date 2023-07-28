//class constructors

//public class practice2{
//    int x;
//    public practice2(){
//        x=5;
//    }
//    public static void main(String[] args){
//        practice2 myObj = new practice2();
//        System.out.println(myObj.x);
//    }
//}
//class parameters.



//public class practice2{
//    int x;
//
//    public practice2(int y){
//        x = y;
//    }
//
//    public static void main(String[] args){
//        practice2 myObj = new practice2(6);
//        System.out.println(myObj.x);
//    }
//}
// having many parameters
public class practice2 {
    String studentName;
    int studentAge;

    public practice2(String name, int age) {
        studentName = name;
        studentAge = age;
    }

    public static void main(String[] args) {
        practice2 student = new practice2("Anita", 25);
        System.out.println(student.studentName + " " + student.studentAge);
    }
}