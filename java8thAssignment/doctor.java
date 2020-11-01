public class doctor extends employee {
    static String name;
    static int age;
    static String designation;
    static int salary;

    public void setDetailsDoctor(String name,int age,int salary,String designation){
    doctor.name = name;
    doctor.age = age;
    doctor.salary = salary;
    doctor.designation = designation;
    }

    void showDetailsDoctor1(){
        System.out.println("The name of the Employee is: " + name);
        System.out.println("The age of the Employee is: " + age);}
    void showDetailsDoctor2(){
        System.out.println("The designation of the Employee is: " + designation);}
    void showDetailsDoctor3(){
        System.out.println("The salary of the Employee is: " + salary);}
    
}
