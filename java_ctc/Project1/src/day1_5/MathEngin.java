package day1_5;

public class MathEngin 
{
	public void add(int n,int m) {
		System.out.println("Addition is:"+(n+m));
	}
	
	public void add(int a,int b,int c) {        //method overloading, polymorphism concept
		System.out.println("Addition is:"+(a+b+c));
	}
	
	public void add(int a,int b,int c,int d) {        //method overloading
		System.out.println("Addition is:"+(a+b+c+d));
	}


	public static void main(String[] args) 
	{
	 MathEngin ob = new MathEngin();
	 ob.add(2, 3);
	 ob.add(2, 3,4);
	 ob.add(2, 3,4 ,5);

	} //end main

}//end class
