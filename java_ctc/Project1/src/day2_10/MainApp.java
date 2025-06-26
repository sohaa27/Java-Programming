package day2_10;

public class MainApp {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.display();
		System.out.println("\n\n");
		Employee e2 = new Employee (102,"Sumit",150000,new MyDate(2,2,2002));
		e2.display();
		
	}//end main
}//end class



//multithreading, collection, file handling
