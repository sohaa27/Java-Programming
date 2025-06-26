package day2_2;
/*
 * Obkect class
 * Object class is cosmic class  (sabse bada raja)
 * Object is parent class of user defined and pre-define  classes
 * Object class methods
 *   1. toString() -- It is used to describe the object
 *   2. equals() -- to check object are equal or not.
 *   3. hashcode() -- it willl return unique positive integer
 *   4. getClass() -- It will used in reflection technique
 *   5. wait()
 *   6. notify()   -- use in multi-threading concept(Obj-Communication)
 *   7. notifyall()
 *   8. clone()  -- to generate clone of  a object
 *   9. finalize() -- this method is called by garbage collector before object is destroyed.
 */

public class Demo 
{
	int x ;
	int y;
	public Demo()
	{
		x=y=0;
	}
	public Demo(int x, int y)
	{
		this.x =x;
		this.y=y;	
	}
	

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + "]";
	}
	public static void main(String[] args) {
		Demo d1 = new Demo(10,20);
		Demo d2 = new Demo(10,20);
		Demo d3 = d1; //alise -- d3 is another name for d1
		
		System.out.println("d1:"+d1);
		System.out.println("d2:"+d2);
		System.out.println("d3:"+d3);
		
		//equals method--- check ref/memory location
		System.out.println("d1 equals d2:"+d1.equals(d2));
		System.out.println("d1 equals d3:"+d1.equals(d3));
		
		//== operator --- check ref/memory location not content
		System.out.println("d1 equals d2:"+(d1==d2));
		System.out.println("d1 equals d3:"+(d1==d3));    
		
		//hashCode() +ve int ==> object
		System.out.println("d1 hashCode:"+d1.hashCode());
		System.out.println("d2 hashCode:"+d2.hashCode());
		System.out.println("d3 hashCode:"+d3.hashCode());

	}// end main
}//end class
