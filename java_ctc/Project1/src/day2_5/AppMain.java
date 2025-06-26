package day2_5;
/*
NOte: subclass constructor
      call super class constructor --child class constructor
 */
class T1
{
	int n;
	public T1()
	{
		n=10;
		System.out.println("Default COnstructor .. Parent class");
	}
	public void displayT1()
	{
		System.out.println("n:"+n);
	}
}//end class
class T2  extends T1
{
	int m;
	public T2()
	{
		m=20;
		System.out.println("Default COnstructor..CHild class");
	}
	public void displayT2()
	{
		System.out.println("m:"+m);
	}
}//end class
public class AppMain 
{
	public static void main(String[] args) 
	{
		T2 ob=new T2(); //global
		ob.displayT1(); //n
		ob.displayT2(); //m
	}//end main
}//end class
