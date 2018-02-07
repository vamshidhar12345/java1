package java1;
 class Mobile
{
String name="nokia";
String colour="grey";
double size=5.4;
double price=9000;
}
class MobileDemo
{
	public static void main(String args[])
	{
		Mobile m=new Mobile();
		System.out.println(m.name);
		System.out.println(m.colour);
		System.out.println(m.size);
		System.out.println(m.price);
	}
}
