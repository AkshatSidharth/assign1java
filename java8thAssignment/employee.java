import java.util.*;

public class employee{
     String name;
     int age;
     String designation;
     int salary;


    void setDetailsDoctor(String name,int age,int salary,String designation){};
    void setDetailsEngineer(String name,int age,int salary,String designation){};
    void setDetailsPilot(String name,int age,int salary,String designation){};
     
    public void getDetails(){
    Scanner sc = new Scanner(System.in);
    employee[] E = {new doctor(), new engineer(), new pilot()};
    doctor[] D = {new doctor(), new doctor(), new doctor()};
    engineer[] En = {new engineer(), new engineer(), new engineer()};
    pilot[] P = {new pilot(), new pilot(), new pilot()};
    

    System.out.println("Enter the name of the employee");
    name = sc.nextLine();

    System.out.println("Enter the age of the employee");
    
    age = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the salary of the employee");

    salary = sc.nextInt();
    sc.nextLine();

    System.out.println("Choose the designation of the employee(Doctor, Engineer, Pilot)");

    designation = sc.nextLine();
   


    if(designation.equalsIgnoreCase("Doctor")){
         E[0].setDetailsDoctor(name,age,salary,designation);
         D[0].showDetailsDoctor1();
         D[1].showDetailsDoctor2();
         D[2].showDetailsDoctor3();
    }  
      else if(designation.equalsIgnoreCase("Engineer")){
          E[1].setDetailsEngineer(name,age,salary,designation);
          En[0].showDetailsEngineer1();
          En[1].showDetailsEngineer2();
          En[2].showDetailsEngineer3();
      } 
      else if(designation.equalsIgnoreCase("Pilot")){
          E[2].setDetailsPilot(name,age,salary,designation);
          P[0].showDetailsPilot1();
          P[1].showDetailsPilot2();
          P[2].showDetailsPilot3();
      }
      else{
          System.out.println("It is not a valid input");
      }
    

    }




    public static void main(String[] args){
    employee e = new employee();
    e.getDetails();
    
}

}