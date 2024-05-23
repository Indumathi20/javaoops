package oops1;
//An abstract class can have a data member, abstract method,
//method body (non-abstract method), constructor, and even main() method.
abstract class Bikes
{
	Bikes()
	{
		System.out.println("this is a constructor");
	}
	abstract void run();
	void changegear()
	{
		System.out.println("it is a non abstract class");
	}
}

class Honda extends Bikes
{
	void run()
	{
		System.out.println("honda is running");
	}
}

public class abstractcl {
	public static void main(String[] args) {
		Bikes b = new Honda();
		b.run();
		b.changegear();
		
	}

}
