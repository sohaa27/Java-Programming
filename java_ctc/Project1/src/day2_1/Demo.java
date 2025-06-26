package day2_1;
/*
 * 'this' keyword:
 * --------------
 * 1. 'this' keyword is used to refer current object
 * 2. 'this' keyword we remove shadow effect
 * 3.'this' keyword we can call same class constructor.
 * toString() Method:-
 * ---------------------
 * toString() Method is object class method
 * toString()  Method is used to describe the object
 * toString() Method is method to show state of the object at current time.
 */
public class Demo 
{
	int x ;
	int y;
	public Demo()
	{
		x=y=0;     //chain assignment
	}
	public Demo(int x, int y)
	{
		this.x=x;                //x=x; causes ambiguity hence this keyword is used. it is used to remove shadow effect
		this.y=y;                   
	}
	
	public String toString()
	{
		return "Demo [x="+x+", y="+y+"]";
	}
	

	public static void main(String[] args) {
		Demo d1 = new Demo(10, 20);
		System.out.println("d1:"+d1); //call toString() Method
		//System.out.println("d1:"+d1.toString());

	}//end main

}// end class
