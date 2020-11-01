 public class pilot extends employee {
     static String name;
     static int age;
     static String designation;
     static int salary;


    public void setDetailsPilot(String name,int age,int salary,String designation){
    pilot.name = name;
    pilot.age = age;
    pilot.salary = salary;
    pilot.designation = designation;
    }

    void showDetailsPilot1(){
        System.out.println("The name of the Employee is: " + name);
        System.out.println("The age of the Employee is: " + age);}
    void showDetailsPilot2(){
        System.out.println("The designation of the Employee is: " + designation);}
    void showDetailsPilot3(){
        System.out.println("The salary of the Employee is: " + salary);}
    

}
