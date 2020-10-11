import java.util.*;
class Student {
 public static void main(String[] args){
 int[] a = new int[5];
 int i;
 int[] b = new int[5];
 Scanner ob = new Scanner(System.in);
 System.out.println("Enter the percentage of five subjects");
 for(i = 0; i < a.length; i++){
    a[i] = ob.nextInt();
    if(a[i]>100 || a[i]<0){
    System.out.println("This input is invalid");
    i=i-1;
    continue;}
 }  
 
  for(int j=0; j < b.length; j++){
    b[j] = a[j];
  if(b[j]>89 && b[j]<100){
    System.out.println("The garde in this subject is"+ " : " + "A");    
    }
  else if(b[j]>79 && b[j]<90){
    System.out.println("The garde in this subject is"+ " : " + "B");    
    }
    else if(b[j]>69 && b[j]<80){
        System.out.println("The garde in this subject is"+ " : " + "C");    
        }  
        else if(b[j]>59 && b[j]<70){
            System.out.println("The garde in this subject is"+ " : " + "D");    
            } 
            else if(a[j]>49 && b[j]<60){
                System.out.println("The garde in this subject is"+ " : " + "E");    
                } 
                else if(b[j]>39 && b[j]<50){
                    System.out.println("The garde in this subject is"+ " : " + "F");    
                    }   
                    else{
                        System.out.println("The garde in this subject is"+ " : " + "Fail");    
                        }   
          }
    


}

}


 

