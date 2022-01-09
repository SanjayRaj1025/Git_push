import java.math.*;
import java.util.Scanner;
public class Quadratic {
	
	Quadratic(double a, double b, double c)
	{
		double d1=((-b+Math.sqrt(b*b-4*a*c))/2*a);
		double d2=((-b-Math.sqrt(b*b-4*a*c))/2*a);
		System.out.println(d1);
		System.out.println(d2);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		double a=sc.nextDouble();
		
		System.out.println("enter the value of b");
		double b=sc.nextDouble();
		
		System.out.println("enter the value of c");
		double c=sc.nextDouble();
		
		Quadratic q = new Quadratic(a,b,c);
		}
	
	

}
