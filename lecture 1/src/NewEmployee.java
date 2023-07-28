public class NewEmployee extends Person1{
    public NewEmployee(){
        this ("(2) invoke employee's overloaded constructor");
        System.out.println("(3) Employee's no-arg constructor is invoked");
    }
    public NewEmployee(String s){
        System.out.println(s);
    }
}