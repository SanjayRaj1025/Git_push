import java.util.Calendar;
import java.util.Scanner;
import java.util.spi.CalendarDataProvider;
public class Leap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int x=sc.nextInt();
		System.out.println("enter the month");
		int m=sc.nextInt();
		
		if(x%4==0&&x%100!=0||x%400==0) {
			System.out.println("the year is a leap year");
			if(m==2) {
				System.out.println("29 days");
			}if(m==1||m==3||m==5||m==7||m==8||m==10||m==12) {
				System.out.println("31 days");
			}
			else if(m==4||m==6||m==9||m==11) {
				System.out.println("30 days");
			}
			
			}
			
		
		else 
		if(m==1||m==3||m==5||m==7||m==8||m==10||m==12) {
			System.out.println("31 days");
		}
		else if(m==4||m==6||m==9||m==11) {
			System.out.println("30 days");
		}
		else{
			System.out.println("28 days");
		
		
	}
	}
}
	

