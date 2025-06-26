package day1_1;
import java.util.Scanner;
public class Test {              // different types of data accept and display

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); // object is created using new 
		
		System.out.print("ENter the int value:");
		int n = sc.nextInt();
		
		System.out.print("ENter the float value:");
		float m = sc.nextFloat();
		
		System.out.print("ENter the double value:");
		double p = sc.nextDouble();
		
		System.out.print("ENter the  Str1 Value(SIngle word):");
		String str1 = sc.next();
		
		sc.nextLine();  //stmt add /n character in input stream
		System.out.print("ENter the  Str2 Value(Multi word):");
		String str2 = sc.nextLine();   // sachin tendulkar
		
		System.out.print("ENter the char value:");
		char ch = sc.next().charAt(0); //s
		
		System.out.println("Value of n:"+n);
		System.out.println("Value of m:"+m);
		System.out.println("Value of p:"+p);
		System.out.println("Value of ch:"+ch);
		System.out.println("Value of str1:"+str1);
		System.out.println("Value of str2:"+str2);



	}

}
