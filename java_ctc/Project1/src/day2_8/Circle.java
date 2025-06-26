package day2_8;

public class Circle extends MyShape
{
	float r;
	public Circle()
	{
		r=0.0f;
	}
	public Circle(float r)
	{
		this.r=r;
	}
	public void area()
	{
		float area;
		area=PI*r*r;
		System.out.println("Area of circle: "+area);
	}
} //end class
