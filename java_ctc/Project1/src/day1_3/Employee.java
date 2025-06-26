package day1_3;

public class Employee {
	int eid;
	String ename;
	int esal;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, int esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public int getEsal() {
		return esal;
	}


	public void setEsal(int esal) {
		this.esal = esal;
	}


	@Override
	public String toString() 
	{
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}


	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.eid=101;
		e1.ename="amit";
		e1.esal=12000;
		System.out.println(e1);   //toString() Method is called..
		
		Employee e2 = new Employee(102,"Sumit",15000);   //para-Constructore
		System.out.println(e2.toString());  //toString() Method is called..
		
		Employee e3 = new Employee ();
		e3.setEid(103);
		e3.setEname("Ajit");
		e3.setEsal(18000);
		System.out.println(e3);

	}//end main

}//end class
