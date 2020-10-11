import java.util.*;
class Employee{
    String name;
    int dOB;
    String month; 
    String year;
    int salary;

  public void inFunc(){
       Scanner ob = new Scanner(System.in);

       System.out.println("Enter your name:");
       name = ob.nextLine();
       
       System.out.println("Enter your date of birth in numeric form:");
       dOB =  ob.nextInt();

       System.out.println("Enter your birth month in words:");
       month = ob.next();

       System.out.println("Enter your birth year in words:");
       year = ob.next();

       System.out.println("Enter your salary in numeric form:");
       salary = ob.nextInt();

       System.out.println("The name of the employee is" + " " + name);
       System.out.println("The date of birth of the employee is" + " " + dOB);
       System.out.println("The birth month of the employee is" + " " +month);
       System.out.println("The birth year of the month is" + " " +year);
       System.out.println("The salary of the employee is" + " " +salary);
       
       if(salary <= 200000){
        System.out.println("The income tax percentage is 5%.");   
       }
       else if(salary <= 300000){
        System.out.println("The income tax percentage is 10%.");   
       }
       else if(salary <= 400000){
        System.out.println("The income tax percentage is 15%.");   
       }
       else if(salary <= 500000){
        System.out.println("The income tax percentage is 20%.");   
       }
       else{
        System.out.println("The income tax percentage is 25%.");     
       }
  }
  
  

  public static void main(String[] args){
     Employee e1 = new Employee();
     e1.inFunc(); 
  }
    
}
