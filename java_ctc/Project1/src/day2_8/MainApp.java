package day2_8;
/*
 * abstract class:
 * ---------------
 * 1) A class contains abstract method as well as non-abstract methods.
 * 2) any class containing abstract method is called abstract class.
 * 3) implementation of abstract method is responsibility of derived class.
 * 4) abstract class can contain public, static, final variables.
 * 5) abstract class reference is created but not object. i.e. abstract class
 *      is not instantiated
 */

public class MainApp 
{

public static void main(String[] args) 
{
		
     MyShape ref;
     
     //parent class reference hold child class object
     ref= new Circle(4);
     ref.area();
     
     //parent class reference hold child class object
     ref= new Rectangle(6,4);
     ref.area();
	}

}
