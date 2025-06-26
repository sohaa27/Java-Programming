package day2_1;
/*
 * * 'this' keyword:
 * --------------
 * 1. 'this' keyword is used to refer current object
 * 2. 'this' keyword we remove shadow effect
 * 3.'this' keyword we can call same class constructor.
 */
/**
 * 
 */
/**
 * 
 */
/**
 * 
 */
/**
 * 
 */
/**
 * 
 */
/**
 * 
 */
/**
 * 
 */
/**
 * 
 */
public class Test 
{
	int x;
	int y;
	public Test() //....1
	{
//		x=10;
//		y=20;
		this(10,20);  // call 3rd
	}
	public Test(int x)  //...2     overloading
	{
		this();     //call..1st   //it must be first statement in constructor method
		this.x =x;
//		y=20;
		
	}
	public Test(int x, int y)//...3
	{
		this.x = x;
		this.y =y;
		
	}
	public String toString()
	{
		return "[x=" + x +" ,y=" + y+"]";
	}

	public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println(t1);
		
		Test t2 = new Test(30);
		System.out.println(t2);
		
		Test t3 = new Test(40,50);
		System.out.println(t3);

	}  //end main
}//end class

