package oops1;
interface An
{
	void print();
}
interface Bn extends An
{
	void show();
}

class intee implements An,Bn
{
	public void print()
	{
		System.out.println("this is priintable");
	}
	public void show()
	{
		System.out.println("this is showable");
	}
}

public class twointerface {
	public static void main(String[] args) {
		intee i = new intee();
		i.print();
		i.show();
		
	}

}
