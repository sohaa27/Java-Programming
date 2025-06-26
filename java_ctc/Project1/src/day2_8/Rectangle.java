package day2_8;

public class Rectangle extends MyShape
{
	int l;
	int b;
	public Rectangle()
	{
		l=b=0;
	}
	public Rectangle(int l, int b)
	{
		this.l=l;
		this.b=b;
	}
	
	public void area()
	{
		float area = l*b;
		System.out.println("Area of Rectangle: "+area);
	}
}// end class
