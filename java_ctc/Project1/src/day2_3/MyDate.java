package day2_3;

public class MyDate 
{
	int d;
	int m;
	int y;
	public MyDate()
	{
		d=m=y=0;
	}
	public MyDate(int d, int m ,int y)
	{
		this.d=d;
		this.m=m;
		this.y=y;
	}
	@Override
	public String toString() {
		return d + "/"+ m +"/"+y;
	}
}//end class
