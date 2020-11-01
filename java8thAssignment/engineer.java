public class engineer extends employee {
    static String name;
    static int age;
    static String designation;
    static int salary;

    public  void setDetailsEngineer(String name,int age,int salary,String designation){
    engineer.name = name;
    engineer.age = age;
    engineer.salary = salary;
    engineer.designation = designation;
    }

    void showDetailsEngineer1(){
        System.out.println("The name of the Employee is: " + name);
        System.out.println("The age of the Employee is: " + age);}
    void showDetailsEngineer2(){
        System.out.println("The designation of the Employee is: " + designation);}
    void showDetailsEngineer3(){
        System.out.println("The salary of the Employee is: " + salary);}
    

}
