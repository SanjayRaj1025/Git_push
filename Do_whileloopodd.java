import java.util.Scanner;
public class Do_whileloopodd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int i=1;
		do {
			System.out.println(i);
			i+=2;
		}while(i<=n);
		
		sc.close();
		
	}

}
