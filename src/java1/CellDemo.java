package java1;
 class Cell {
String name;
String colour;
double size;
double price;
 void input()
 {
	name="mi";
	colour="grey";
	size=5.5;
	price=10000;
 }
  void display()
  {
	  System.out.println("name "+name);
	  System.out.println(colour);
	  System.out.println(size);
	  System.out.println("price "+price);
  }
} class CellDemo
{
	public static void main(String args[])
	{
	Cell c=new Cell();
	c.input();
	c.display();
}
}