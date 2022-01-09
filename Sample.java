import java.util.Scanner;
public class Sample {
	int a;
	int b;
	String name;
	public Sample(int a, int b, String name)
	{
		this.a=a;
		this.b=b;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Sample [a=" + a + ", b=" + b + ", name=" + name + "]";
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a =sc.nextInt();
		int b = sc.nextInt();
		String n = sc.next();
		Sample s = new Sample(a, b, n);
		System.out.println(s.a);
		System.out.println(s.b);
		System.out.println(s.name);
	}
	
}
