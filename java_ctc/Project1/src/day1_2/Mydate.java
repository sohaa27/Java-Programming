package day1_2;
/*
 * class
 * {
 * 		members
 * }
 * 
 * class
 * {
 * 		instance members - belongs to object
 * 			can be of 3 types
 * 			1. instance fields
 * 			2. instance methods
 * 			3. instance block
 * 		static members -  belongs to class
 * 			can be of 3 types
 * 			1. static fields
 * 			2. static methods
 * 			3. static block
 */
public class Mydate {
    int d;           //member - instance fields
    int m;
    int y;
    
	public void initDate() 
	{
		d = 1;
		m=1;
		y = 2025;

}
	public void display()
	{
		System.out.println("Date:"+d+"/"+m+"/"+y);
	}
}