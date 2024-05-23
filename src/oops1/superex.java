package oops1;

class Alphabets
{
	char c = 'A';//super can be used to refer immediate parent class instance variable.
	void print() {
		System.out.println("this is a uppercase");
	}
	
}

class Lower extends Alphabets
{
	char c = 'a';
    void display()
    {
    	System.out.println(c);
    	System.out.println(super.c);
    }
    void print()
    {
    	System.out.println("this is lowercase");//super can be used to invoke parent class method
    }
    void run()
    {
    	System.out.println("running");
    }
    
}
class now extends Lower
{
	void print()
	{
		System.out.println("this is a now method");
	}
	void work()
    {
    	super.print();
    	
    }
}
public class superex {
public static void main(String[] args) {
	Lower a = new Lower();
	a.display();
	now n = new now();
	n.work();//calls the immediate parent only
	
}
}
