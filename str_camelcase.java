import java.util.Scanner;
 
public class str_camelcase {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String x1 = s.nextLine();
        String res = "";
        char firstChar = x1.charAt(0);
        res = res + Character.toUpperCase(firstChar);
        for (int i = 1; i < x1.length(); i++) {
            char curChar = x1.charAt(i);
            char prevChar = x1.charAt(i - 1);
            if (prevChar == ' ') 
            {
                res = res + Character.toUpperCase(curChar);
            }
            else 
            {
                res = res + curChar;
            }
        }
        System.out.println(res);
    }
}
