package java1;

public class BitwiseDemo {
public static void main(String args[])
{
	byte a=5;
	byte b=6;
	byte g=-8;
	int c;
	int d;
	int e;
	int f;
	float h;
	e=b<<1;
	c=a&b;
	d=a^b;
	f=b>>>1;
	h=g>>>1;
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	System.out.println(h);
}
}