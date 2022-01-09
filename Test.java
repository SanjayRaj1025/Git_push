	public class Test
	{
		int x;
		static int y;
		
		int m1()
		{
			System.out.println("m1 method started");
			return 1;
		}

		static int m2()
		{
			System.out.println("m2 method started");
			return 2;
		}
		
		int m3()
		{
			System.out.println("m3 method started");
			return 3;
		}
			
		int m4()
		{
			System.out.println("m4 method started");
			return 4;
		}
	}
	class Test1 extends Test
	{
		 int m1()
		{
			System.out.println("class B m1 method started");
			return 1;
		}
		static int m2()
		{
			System.out.println("class B m2 method started");
			return 2;
		}
		int m3()
		{
			System.out.println("class B m3 method started");
			return 3;
		}
		int m4()
		{
			System.out.println("class B m4 method started");
			return 4;
		}
	}
	


