package day2_7;
/*
 * Note: RTTI - run time type identification
 *     instanceof- operator
 */
import java.util.*;
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
	public static void display(Emp e)
	{
		e.m1();  //inherited method
		e.calSal(); //override method
		if(e instanceof Mgr)
			((Mgr)e).m2();
		if(e instanceof SalesMgr)
			((SalesMgr)e).m3();
	}//end display

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		Emp e=null;
		do
		{
			System.out.println("1)Create Emp Profile");
			System.out.println("2)Create Emp Profile");
			System.out.println("3)Create SalesMgr Profile");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch (ch)
			{
			case 1: e= new Emp();
			       display(e);
			       break;
			case 2: e= new Mgr();
		       display(e);
		       break;
			case 3: e= new SalesMgr();
		       display(e);
		       break;
		    default:
		    	System.out.println("Wrong..choice");
		    	break;
			}//end switch
		}while(ch!=4); //end while
	
	}//end main
}//end class
