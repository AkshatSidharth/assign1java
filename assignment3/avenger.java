public class avenger{
  String name;
  int age;
  String power;
  String weapon;
  String planet;

  public void getDetails(String name,int age,String power, String weapon, String planet) {
      this.name = name;
      this.age = age;
      this.power = power;
      this.weapon = weapon;
      this.planet = planet;
    }

   public void displayDetails(){
       System.out.println("Name : " + name);
       System.out.println("Age : " + age);
       System.out.println("Power : " + power);
       System.out.println("Weapon : " + weapon);
       System.out.println("Planet : " + planet);
   } 


   public static void main(String[] args){
       avenger[] arr1 = new avenger[5];

       for(int i = 0; i < arr1.length; i++ ){
           arr1[i] = new avenger();
       }

       arr1[0].getDetails("Snakeman",34,"Venom", "Floating Fangs", "Serpentania");
       arr1[0].displayDetails();
       System.out.println();

       arr1[1].getDetails("Punchman",24,"Punch and Stamina", "Five inch Punch", "Earth");
       arr1[1].displayDetails();
       System.out.println();

       arr1[2].getDetails("Sandman",76,"Stength", "Sandstrom", "Titan");
       arr1[2].displayDetails();
       System.out.println();

       arr1[3].getDetails("Superman", 1000, "SuperHuman Stength", "Laser Eyes", "Krypton");
       arr1[3].displayDetails();
       System.out.println();

       arr1[4].getDetails("He-man", 4000, "SuperHuman", "Death Sword", "Skull Island");
       arr1[4].displayDetails();
       System.out.println();
   }

}