
import java.util.Scanner;


public class leapyear {
     public static void main(String[] args) {
      System.out.println("enter the year");
         int x1;
        Scanner s=new Scanner(System.in);
        x1=s.nextInt(); 
        if(x1%4==0){
             System.out.println("the year" + x1 + "is leap year");
        }
        else{
         System.out.println("the year" + x1 + "is not a leap year");
        }
     }
    
}
