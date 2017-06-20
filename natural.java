
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
public class natural {
    public static void main(String[] args) {
        int x1,i=1,sum=0;
      System.out.println("enter the number");
         
        Scanner s=new Scanner(System.in);
        x1=s.nextInt(); 
        while(i<=x1){
        sum+=i;
        i++;
        }
         System.out.print("Sum of "+x1+" numbers is :"+sum);
    
}}
