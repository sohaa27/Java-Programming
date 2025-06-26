package day2_10;

public class Employee 
{
	int eid;
	String ename;
	int esal;
	MyDate doj;
	public Employee()
	{
		eid=101;
		ename="Amit";
		esal=12000;
		doj= new MyDate(1,1,2025);
	}
	public Employee(int eid, String ename, int esal, MyDate doj)
	{
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
		this.doj=doj;
	}

	public void display()
	{
		System.out.println("Employee Id:" + eid);
		System.out.println("Employee Name:" + ename);
		System.out.println("Employee Salary:" +esal);
		System.out.println("Employee DOJ:" +doj);
	}
}
