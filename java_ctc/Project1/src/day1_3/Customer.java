package day1_3;

public class Customer 
{
	private int custId;
	private String custName;
	// Accessor and Mutator Methods
	// setter method (Mutator Method)
	
	public void setCustId(int custId)
	{
		this.custId=custId;
	}
	
	public int getcustId(){
		return custId;
	}


	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	public void display()
	{
		System.out.println("Customer Id:"+custId);
		System.out.println("Customer Name:"+custName);

	}
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setCustId(101);
		c1.setCustName("amit");
		System.out.println("Customer Id:"+c1.getcustId());
		System.out.println("Customer Name:"+c1.getCustName());
		System.out.println("\n\n");
//		c1.display();

	}// end main

}// end class
