
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 
public class firstlast{
public static void main(String[] args) {
	
	try{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
			  System.out.println("enter the number");
			  int n=Integer.parseInt(br.readLine());
 
			  int last=n%10;
			  int first=0;
			  while(n>=1){
				  first=n;
				  n=n/10;
			  }
 
	System.out.println("sum of first and last digits: "+(first+last));
	}
 
	catch(IOException e){
		System.out.println("error in input");
		}
 
	}
}
