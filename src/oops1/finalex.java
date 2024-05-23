package oops1;

final class finalexm
{
	//If you make any variable as final, you cannot change the value of final variable
	
	static final int ONE; //unintialized final variable
	final int two;
	
	//If you make any method as final, you cannot override it.
	final void run(){System.out.println("running");}  
	
	//The blank final variable can be static also which will be initialized in the static block only.
	static 
	{
		ONE = 90;
	}
	// a final variable can be left uninitialized (blank final variable) if it is initialized in the constructor only
	
	finalexm(int two)
	{
		this.two = two;
	}
	void display()
	{
		System.out.println("this is one: "+ONE);
		System.out.println("this is final variable: "+two);
	}
	//If you declare any parameter as final, you cannot change the value of it.
	int cube(final int n){  
		   n=n+2;//can't be changed as n is final  
		   n*n*n;  
		  }  
}

//If you make any class as final, you cannot extend it.


public class finalex {
	public static void main(String[] args) {
		finalexm f = new finalexm(87);
		f.display();
		
	}

}
