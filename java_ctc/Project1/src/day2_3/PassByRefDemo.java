package day2_3;

public class PassByRefDemo 
{
	public static void swap(MyDate d[]) 
	{
	MyDate temp;
	temp=d[0];
	d[0]=d[1];
	d[1]=temp;
	}//end swap method

	public static void main(String[] args) 
	{
		MyDate dt[] = new MyDate[2];
		dt[0] = new MyDate(1,1,2001);
		dt[1] = new MyDate(2,2,2002);
		System.out.println("before swap");
		System.out.println("d1:"+dt[0]);
		System.out.println("d2:"+dt[1]);
		swap(dt);        //name of the array -- starting address of an array.
		// reference is copied not object 
		System.out.println("after swap");
		System.out.println("d1:"+dt[0]);
		System.out.println("d2:"+dt[1]);
	
	}//end main
}  // end class
