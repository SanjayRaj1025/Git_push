package com.techno.assignments;

public class Main {
	public static void main(String[] args) {
		SeniorDeveloper sd1 = new SeniorDeveloper();
		sd1.getid();
		sd1.setname("Sanjay");
		sd1.setsalary(50000);
		sd1.coding();
		sd1.softwaredevelopment();
		System.out.println(sd1);

		System.out.println("*****************************");

		SeniorDeveloper sd2 = new SeniorDeveloper();
		sd2.getid();
		sd2.setname("sanjana");
		sd2.setsalary(650000);
		sd1.coding();
		sd1.softwaredevelopment();
		System.out.println(sd2);
		System.out.println("number of senior development:" + sd2.noofdevp);

		System.out.println("###############");

		Intern i = new Intern();
		sd1.getid();

		i.setname("agasthya");
		i.setsalary(10);
		i.training();
		i.mockInterview();
		System.out.println(i);

		System.out.println("number of intern trainee:" + i.noofint);
		System.out.println("**********************************");

		Mte m = new Mte();
		m.getid();
		m.setname("sanjay raj");
		m.setsalary(75000);
		m.Manual_tester();
		System.out.println(m);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		Mte m1 = new Mte();
		m1.getid();
		m1.setname("sanjay raj h b");
		m1.setsalary(80000);
		m1.Manual_tester();
		System.out.println(m1);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		DeliveryManager dm = new DeliveryManager();
		dm.getid();
		dm.setname("rishikesh");
		dm.setsalary(85000);
		System.out.println(dm);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

	}

}
