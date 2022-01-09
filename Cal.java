import java.util.Scanner;
public class Cal {
	
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public int sub(int a,int b) 
	{
		int c=a-b;
		return c;
	}
	
	public int mul(int a,int b) 
	{
		int c=a*b;
		return c;
	}
	
	public int div(int a,int b) 
	{
		int c=a/b;
		return c;
	}
	
	

	public static void main(String[] args) {
		
		Cal c=new Cal();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		
		System.out.println("enter the value of b");
		int b=sc.nextInt();
		
		int addition=c.add(a,b);
		int subtraction=c.sub(a,b);
		int multiplication=c.mul(a,b);
		int division=c.div(a,b);
		
		System.out.println("addition:"+addition);
		System.out.println("subtraction:"+subtraction);
		System.out.println("multiplication:"+multiplication);
		System.out.println("division:"+division);
		
		}
	

}
