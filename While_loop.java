import java.util.Scanner;
public class While_loop {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int i=2;
		while(i<=n) {
			System.out.println(i);
			i=i+2;
		}
		
	}

}
