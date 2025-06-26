package day1_4;

public class Employee {
	int eid;      // Instance FIekds
	String ename;
	int esal;
	static int count;        //static field
	
	static
	{
		count=0;
		System.out.println("static block...1st");
	}
	
	
	public Employee()         // Default COnstructor
	{
//		super();
	    eid=++count;        //eid is auto incremented
	    ename=null;
	    esal=0;
	}
	
	public Employee(String ename, int esal) //Para-Constructor
	{
		super();
		this.eid = ++count;
		this.ename = ename;
		this.esal = esal;
	}

	static
	{
		System.out.println("static block....2nd");
	}

	@Override
	public String toString() 
	{
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
    public static void displayCnt()  //static methods
    {
    	System.out.println("Employee COunt:"+count);
    }                               // static can call static. 
    
	public static void main(String[] args) 
	{
		System.out.println("start main");
		Employee e1 = new Employee("Amit",12000); // parameterized constructor is called
		Employee e2 = new Employee("sAmit",12000);// parameterized constructor is called
		System.out.println(e1);
		System.out.println(e2);
		Employee.displayCnt(); //call static method using class name 
		System.out.println("end main");

	}//end main
	static
	{
		System.out.println("static block....3nd");
	}


}//end class
