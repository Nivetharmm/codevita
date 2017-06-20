/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elcot
 */
import java.util.Scanner;

public class alphabet
{
    public static void main(String args[])
    {
        char n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        n = s.next().charAt(0);
        if((n>='a' && n<='z') || (n>='A' && n<='Z'))
        {
            System.out.print(n + " is an Alphabet");
        }
        else
        {
            System.out.print(n + " is not an Alphabet");
        }
    }
}
