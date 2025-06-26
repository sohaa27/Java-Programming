package day1_5;

public class ArrayDemo1 {

	public static void main(String[] args) 
	{
		int num[] = {10,20,30,40,50}; // array declare nd initialize
		int []num1 = {10,20,30,40,50};
		System.out.println("Array Elements are:");
		
		for(int i =0;i<num.length;i++)
		{
			System.out.println(""+num[i]);
		}
		
		System.out.println("Array Elements using enhance for loop:");
		for (int n:num) //fwd loop- automated loop- no int,condition,increment or decrement
		{
			System.out.println(""+n);
		}
		
	}//end main

}//end class

/*
 Array are static in nature. they cannot grow or shrink at runtime.
 Array sized is fixed.
 Array stores homogeneous elements.
 Array stores primitive type/ ref-object types(Array of Objects)
 
 Array are first class objects in java
 we can create array without new operator. i.e.
 int num[]={10,20,30} -- this notation is called first class notation. 
 
 we can declare array,
  int num[]= new int[5];
  int []num= new int[5];
  int num[][]= new int[2][2];
  int [][]num= new int[2][2];

*/