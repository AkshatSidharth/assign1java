class Employee{
 String name;
 int age;
 String city;

public void showNameAgeCity(String name, int age, String city)
{
     this.name = name;
     this.age = age;
     this.city = city;
     System.out.println("The name is" + " " + name);
     System.out.println("The age is" + " " + age);
     System.out.println("The city is" + " " + city);
}

public static void main(String[] args)
{
       Employee e1 = new Employee();
       e1.showNameAgeCity("Saurabh",23,"Chennai");
       Employee e2 = new Employee();
       e2.showNameAgeCity("Akshat",22,"Bokaro");
}
   }
