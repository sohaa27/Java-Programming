package day1_5;
import java.util.Scanner;
public class Product 
{
	int pid;
	String pname;
	int pqty;
	int pprice;
	static int cnt=0;
	
	public Product()
	{
		pid=++cnt;
		pname=null;
		pqty=0;
		pprice=0;
	}
	public Product(String pname, int pqty, int pprice)
	{
		this.pid = ++cnt;
		this.pname = pname;
		this.pqty =pqty;
		this.pprice = pprice;
	}
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
//		System.out.print("Product Id:");
//		this.pid=sc.nextInt();
		System.out.print("Product Name:");
		this.pname=sc.next();
		System.out.print("Product QTy:");
		this.pqty=sc.nextInt();
		System.out.print("Product Price:");
		this.pprice=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Product Id:"+pid);
		System.out.println("Product Name:"+pname);
		System.out.println("Product Qty:"+pqty);
		System.out.println("Product Id:"+pprice);
	}
	public static void main(String[] args) {
//		Product P1 = new Product("Monitor",5,5000);
//		Product P2 = new Product("Keyboard",15,1200);
		Scanner sc =new Scanner(System.in);
//		Product prod[] = new Product[100];   //insteaad of creating 100 times
		System.out.print("How many Products?");
		int n = sc.nextInt(); //3
		Product prod[] = new Product[n];
		System.out.print("Enter the product details");
		for(int i =0;i<n;i++)
		{
			prod[i]=new Product();
			prod[i].accept();
		}
		System.out.println("\n\nProduct Details Are:");
		for(int i=0;i<n;i++)
		{
			prod[i].display();
		}

	} //end main

}
