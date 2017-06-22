import java.util.Scanner;


public class rev_digits {
    public static void main(String args[])
   {
       System.out.println("enter the digit to be reversed");
         int x1,reverse;
        reverse = 0;
        Scanner s=new Scanner(System.in);
        x1=s.nextInt();
 
      while( x1 != 0 )
      {
          reverse = reverse * 10;
          reverse = reverse + x1%10;
          x1 = x1/10;
      }
 
      System.out.println("Reverse of entered number is "+reverse);
   }
    
}
