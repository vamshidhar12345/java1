package java1;

public class CalcDemo {
public static void main(String args[])
{
	int a=10,b=5,c,choice=5;
	switch(choice)
	{
	case 1: c=a+b;
			System.out.println("sum is " +c);
			break;
	case 2: c=a-b;
			System.out.println("sub is " +c);
			break;
	case 3: c=a*b;
			System.out.println("mul is " +c);
			break;
	case 4: c=a%b;
			System.out.println("div is " +c);
			break;
	case 5: c=a/b;
			System.out.println("diff is " +c);
			break;
	default:System.out.println("enter correct choice");		
	}
}
}
