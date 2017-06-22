import java.util.Scanner;
 class factorial {
    public static void main(String args[]){
    int i;
    int fact=1;
   System.out.println("enter the factorial value");
         int x1;
        Scanner s=new Scanner(System.in);
        x1=s.nextInt();
    
    for(i=1;i<=x1;i++){
     fact=fact*i;
    
    }
    System.out.print("Factorial of" + x1 + "is" +fact );
    }
    
}
