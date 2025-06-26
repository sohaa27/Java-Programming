package day2_1;
/*
 * 'this' keyword refer to current object
 */
public class ComplexNumber 
{
	int real;
	int img;
	public ComplexNumber()
	{
		real=img=0;
	}
	public ComplexNumber(int real, int img)
	{
		this.real = real;
		this.img = img;
	}
	
	public ComplexNumber addComplexNumber(ComplexNumber c)
	{
		ComplexNumber temp = new ComplexNumber();
		temp.real= this.real+c.real;
		temp.img=this.img+c.img;
		return temp;
	}// end addComplexNumber Method
	public String toString()
	{
		return real+"+"+img+"i";
	}
	

	public static void main(String[] args) {
		ComplexNumber c1 = new ComplexNumber (3,2);
		ComplexNumber c2 = new ComplexNumber (4,2);
		ComplexNumber c3 = c1.addComplexNumber(c2);
		System.out.println("c1 ="+ c1);
		System.out.println("c2="+ c2);
		System.out.println("c3 ="+ c3);

	}//end main
}//end class
