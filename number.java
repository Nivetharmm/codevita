import java.util.Scanner;
public class number {
     public static void main(String[] args) {
      System.out.println("enter the number");
         int x1;
        Scanner s=new Scanner(System.in);
        x1=s.nextInt();
        if(x1>0){
        System.out.print("The number is positive");}
        else if(x1<0){
            System.out.print("The number is negative");
        }
        else{
        System.out.print("The number is zero");}
     }
    
}
