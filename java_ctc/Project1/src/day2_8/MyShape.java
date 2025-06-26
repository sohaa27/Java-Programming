package day2_8;

abstract public class MyShape 
{
   public final float PI=3.14f;
	
	abstract public void area();  //only declaration not definition
  
  public void m1()    //non abstract method
  {
	  System.out.println("M1 method");
  }
  
} //end class
