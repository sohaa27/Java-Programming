package day1_3;
/*
 * - COnstruuctor is special type of method
 * -same name as class name
 * -not allowed to use return type not even void.
 * -you can use access specifiers- public,private,protected,default
 * 
 * 
 */
public class Student 
{
	int sid;
	String sname;
	float sper;
	
	public Student()   // default constructor
	{
		sid=101;
		sname="amit";
		sper=91.0f;
		System.out.println("default constructor is called...1st");
	}
	
	public Student(int sid, String sname,float sper)   // parameterized constructor
	{
		this.sid=sid;
		this.sname=sname;
		this.sper=sper;
		System.out.println("paraemterized constructor is called...2nd");
	}
	
	public void display()
	{
		System.out.println("Student Id:"+sid);
		System.out.println("Student Name:"+sname);
		System.out.println("Student Percentage:"+sper);
	}
	
	public static void main(String[] args) {
		Student s1= new Student(); // default constructor is called.. s1[sid/name/sper]
		s1.display();
		
		Student s2= new Student(102,"amit",72.1f);  // Parameterized  constructor is called
		s2.display();
			

	}

}
