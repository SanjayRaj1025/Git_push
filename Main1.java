
public class Main1 {
		public static void main(String[] args) 
		{
			Test a=new Test();
			int m1=a.m1();
			int m2=Test.m2();
			int m3=a.m3();
			int m4=a.m4();
			
			System.out.println(m1);
			System.out.println(m2);
			System.out.println(m3);
			System.out.println(m4);
			
			Test1 b=new Test1();
			
			int p=b.m1();
			int q=Test1.m2();
			int r=b.m3();
			int s=b.m4();
			  
			System.out.println(p);
			System.out.println(q);
			System.out.println(r);
			System.out.println(s);
			
			
		}
	}


