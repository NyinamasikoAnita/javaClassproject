
import java.util.ArrayList;
import java.util.List;

//student class
public class Student {
    private int student_id;
    private String student_name;
    private List < Double> grades;


//    public Student(String student_id , String student_name ){
//        this.student_id = student_id;
//        this.student_name = student_name;
//
//
//    }

//    Getters
    public int getStudent_id(){
        return student_id;
    }

    public String getStudent_name(){
        return student_name;
    }


//    Setters
    public void setStudent_id(int newStudent_id){
        this.student_id = newStudent_id;
    }

    public void setStudent_name(String newStudent_name){
        this.student_name= newStudent_name;
    }

//    getter method which returns a list of double values.
    public List < Double> getGrades() {
        return grades;
    }

//    method that allows adding grades to the grades list.
    public void addGrade(double grade){
//        validations checking if the grades list is null.
        if (grades == null){
            grades = new ArrayList< >();
        }
        grades.add(grade);

    }
    public static void main(String[] args){
//        creating an instance of student
        Student newStudent = new Student();

//        set the values using the setter methods.
        newStudent.setStudent_id(1);
        newStudent.setStudent_name("ANITA");

//        ADD GRADES USING THE addGrade() method. grades are added to the grades list.
        newStudent.addGrade(80.6);
        newStudent.addGrade(50.5);
        newStudent.addGrade(75.9);


//        RETRIEVE or GET THE VALUES USING THE GETTER METHODS
        int student_id = newStudent.getStudent_id();
        String student_name = newStudent.getStudent_name();
        List < Double > grades = newStudent.getGrades();
//
//        print the values
        System.out.println("Student ID:" +  student_id);
        System.out.println("Student name:" + student_name);
        System.out.println("Grades :" + grades);

//        getting the grade at index 1
        System.out.println( "Grade at index1:" + grades.get(1));

//        modifying grade list.
        grades.set(2, 90.0);
        System.out.println("modified grade list:" + grades);




    }

}
