package java1;

public class CirArea {
	static double area(int r)
	{
		double a;
		a=3.14*r*r;
		return a;
	}
	public static void main(String args[])
	{
		CirArea c=new CirArea();
		
		c.area(5);
		System.out.println(c);
	}

}

