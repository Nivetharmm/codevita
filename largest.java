
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
public class largest {
     public static void main(String[] args) {
          System.out.println("enter the number1");
         int x1;
        Scanner s=new Scanner(System.in);
        x1=s.nextInt();
         System.out.println("enter the number2");
         int x2;
        Scanner s1=new Scanner(System.in);
        x2=s1.nextInt();
         System.out.println("enter the number3");
         int x3;
        Scanner s2=new Scanner(System.in);
        x3=s2.nextInt();
        if((x1>x2)&&(x1>x3))
        {
             System.out.println("the number" + x1 + "is largest");
        }
        else if((x2>x1)&&(x2>x3))
        {
             System.out.println("the number" + x2 + "is largest");
         }
         else
        {
             System.out.println("the number" + x3 + "is largest");
         }
}}
