package java1;

public class StudentGrade {
public static void main(String args[])
{
	int sub1=60,sub2=70,sub3=80;
	int total=210;
	double avg=total/3;
	if(avg>=80&&avg<=100)
	{
		System.out.println("avg comes A " +avg);
	}
	if(avg>=60&&avg<=80)
	{
		System.out.println("avg comes B "  +avg);
	}
	if(avg>=40&&avg<=60)
	{
		System.out.println("avg comes C " +avg);
	}
}
}
