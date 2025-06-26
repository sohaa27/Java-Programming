package day2_4;
/*
 * Inheritance:
 * 1. Inheritance is used to acquire properties and methods of super class in to child class.
 * 2. Inheritance is used for classification
 * 3. Inheritance is used to reduce code length 
 * 4. Inheritance is used to avoid duplicate code.
 * 5. using Inheritance we can easily implement generalization and specialization6
 * 6. Inheritance uses 'extends' keyword.
 */
class Emp
{
	public void m1()
	{
		System.out.println("m1 Method...EMp");
	}
	public void calSal()
	{
		System.out.println("Basic Sal-IT-PF");
	}
}//end class
class Mgr extends Emp
{
	public void m2()
	{
		System.out.println("m2 Method..mgr");
	}
	public void calsal()
	{
		System.out.println("Basic Sal+Incentives-(IT-PF)");
	}
}// end class
public class EmpMain 
{

	public static void main(String[] args) 
	{
		Emp ob1 = new Emp();
		ob1.m1();
		ob1.calSal();   //Emp
//		ob1.m2();       //MGr Method -- error
		//Note: Parent class object cannot use child class members
		System.out.println("\n\n");
		Mgr ob2 = new Mgr();
		ob2.m1();       //inherited method
		ob2.m2();      //special method child class
		ob2.calsal();  //override method
		
		

	}//end main
}//end class
