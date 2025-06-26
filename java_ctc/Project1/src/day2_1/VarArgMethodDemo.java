package day2_1;

public class VarArgMethodDemo 
{
	public void add(int...a) //ellipsis(...) should be right most parameter(float m, char c, int...a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Addition is:"+sum);
	}

	public static void main(String[] args) 
	{
		VarArgMethodDemo ob = new VarArgMethodDemo();
		ob.add(2,3);
		ob.add(2,3,4);
		ob.add(2,3,4,5);
		

	}// end main

}//end class
//public void add(int x, int...a);--> Valid
//public void add(float x, int...a);    -->valid
//public void add(float x, int...a, char ch);   --->Invalid
//public void add(int...a,char ch);         --->Invalid
//public void add(int...x,float...a);         --->Invalid
//public void add(int...a);    --->valid
//...elipse
//var-arg must be right most parameter
//we can use only one elipse parameter
// we can use only one elipse paramter/ var-arg in method signature.