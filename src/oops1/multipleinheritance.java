package oops1;
//If a class implements multiple interfaces, or an interface extends multiple interfaces, 
//it is known as multiple inheritance.

//all the fields are public, static and final by default. 
interface printable
{
	void print();
}
interface showable
{
	void show();
}

class AB implements printable,showable
{
	public void print()
	{
		System.out.println("it is printed");
	}
	public void show()
	{
		System.out.println("it is shown");
	}
}
public class multipleinheritance {
	public static void main(String[] args) {
		AB a = new AB();
		a.print();
		a.show();
		
	}

}
