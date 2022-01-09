import java.util.Scanner;
public class Exercise3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to be used for its multiplication table:");
		int x=sc.nextInt();
		int sum=0;
		for(int i=1;i<=10;i++) {
		
			System.out.println(x+"x"+i+"="+(i*x));
			sum=sum+(i*x);
		}
		System.out.println("sum="+sum);
		sc.close();
	}

}
