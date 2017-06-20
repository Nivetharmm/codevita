
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elcot
 */
public class sumof_numbers {
     public static void main(String[] args) {
        int n,sum=0;
      System.out.println("enter the n");
         
        Scanner s=new Scanner(System.in);
        n=s.nextInt(); 
        for(int i=1;i<=n;i++){
        sum+=i;
       
        }
         System.out.print("Sum of "+n+" numbers is :"+sum);
    
}
    
}
