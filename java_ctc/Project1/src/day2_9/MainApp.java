package day2_9;
/*
 * Interfaces:
 * 1. Interfaces are another path of multiple inheritance in java
 * 2. Interface is collection of abstract method, and public, static, final variable(jdk1,7)
 * 3. Interface is collection of abstract method, and public, static, final variable + create static methods + 
 *       create default methods in interface.
 * 4. Interface abstract methods are implemented by child class
 * 5. SYntax :
 *     public interface mathematical
 *     {
 *       abstract public void add(int,int);  
 *     }
 *     class MathEngin implements mathematical
 *     {
 *      public void add(int a, int b)
 *          {
 *           system.out.println("Addition is: "+(a_b));     
 *          }
 *      
 *      }
 * 6. one interface can extends another interface
 *        public interface I1
 *        {
 *           abstract public void m1();
 *        }
 *        public interface I2 extends I1 
 *        {
 *           abstract public void m2();
 *        }
 * 7. One interface cannot implement another interface
 * 8. One class can implement multiple interfaces
 *            class Demo implements I1, I2,I3...
 *            {
 *            }
 * 9. We can create reference of interface, not object.
 * 10. Interface is contract between provider and consumer.
 * 11. Interface is "programming by contract".
 */
public class MainApp {

	public static void main(String[] args) 
	{
		conversion ref;
		
		ref=new Convertor();
		System.out.println("2500 gm is:"+ref.gmtokg(2500)+"Kg");
		System.out.println("3.5kg is:" + ref.kgtogm(3.5f)+"Gm.");
	
	}// end main
}//end class
