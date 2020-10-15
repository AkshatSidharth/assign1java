import java.util.Scanner;

public class array3{
    public static void main(String[] args){
        int[] a = new int[5];
        int sum = 0;

        System.out.println("Enter the five numbers ");
        for(int i = 0; i < a.length; i++){
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();
        }
        
        for(int j = 0; j < a.length; j++){
            sum += a[j];
        }

        System.out.print("The sum of five numbers is" + " " + sum);

        
 
    }
}