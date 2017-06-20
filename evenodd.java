 import java.util.Scanner;
public class evenodd {
     public static void main(String[] args) {
      System.out.println("enter the number");
         int x1;
        Scanner s=new Scanner(System.in);
        x1=s.nextInt(); 
        if(x1%2==0){
             System.out.println("the number is even");
        }
        else{
         System.out.println("the number is odd");
        }
     }
}
