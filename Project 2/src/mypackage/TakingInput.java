package mypackage;
import java.util.Scanner;
public class TakingInput 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//System.out.println("Taking input from the user");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		float a=sc.nextFloat();
		//System.out.println(sc.hasNextInt());
		//boolean b1=sc.hasNextInt();
		//System.out.println(b1);
		System.out.println("Enter second number");
		float b=sc.nextFloat();
		System.out.println("The remainder of two numbers is :\n"+(a%b));
		//System.out.println(sc.next()=="Dev");

	}

}
