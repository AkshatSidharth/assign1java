import java.util.Scanner;

public class array2{
    public static void main(String[] args){
        int[] a = new int[5];
      

        System.out.println("Enter the five numbers ");
        for(int i = 0; i < a.length; i++){
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();
        }
        
        for(int j = 0; j < a.length; j++){
            if(a[j]%2 != 0){
                System.out.println("The odd number is " + a[j]);
            }
            else 
            continue;
        }

        

        
 
    }
}