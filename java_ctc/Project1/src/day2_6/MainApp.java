package day2_6;
/*
 * Note: 
 */
class Emp
{
	public void m1()
	{
		System.out.println("M1 method....emp class");
	}
	
	public void calSal()
	{
		System.out.println("calsal method...emp class");
		
	}
	
}

class Mgr extends Emp
{
	public void m2()
	{
		System.out.println("m2 method.....Mgr class");

	}
	
	public void calSal()
	{
		System.out.println("calsal merhod...Mgr class");
	}
	
}

class SalesMgr extends Emp
{
	public void m3()
	{
		System.out.println("m3 method.....SalesMgr class");
	}
	
	public void calSal()
	{
		System.out.println("calsal merhod...SalesMgr class");
	}
	
}

public class MainApp {

	public static void main(String[] args) {
		System.out.println("\n\n Emp Object Created");
		Emp e1= new Emp();
		e1.m1();
		e1.calSal();
		System.out.println("\n\n Mgr Object Created");
		//parent class ref == child class object
		e1 = new Mgr();
		e1.m1(); // inherited..Emp class
		((Mgr)e1).m2();   //special method Mgr class [Down Casting]
		e1.calSal();// at compile time Mgr Class...ref Mgr
		System.out.println("\n\n SalesMgr Object Created");
		e1=new SalesMgr();
		e1.m1();  //inherited...EMp class
		((SalesMgr)e1).m3();   //special method SalesMgr  class
		e1.calSal();// at compile time   SalesMgr Class...ref SalesMgr
	}//end main
}//end class
