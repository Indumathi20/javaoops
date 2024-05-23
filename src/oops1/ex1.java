package oops1;
import java.util.*;

class Bank
{
	int in;
	int pri;
	int yr;
	Bank()//default constructor
	{}
	Bank(int in,int pri,int yr)//parameterized constructor
	{
		this.in = in;
		this.pri = pri;
		this.yr = yr;
	}
	void si()
	{
		int result = (pri * yr * in)/100;
		System.out.println("si is "+result);
	}
	void ci()
	{
		
		int amt = (pri * (1+(in/100)));
		double pow = Math.pow(amt, yr);
		System.out.println("ci is" + pow);
	}
}

public class ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Bank icic = new Bank(10,24000,2);
//		icic.intialise(10, 24000, 2);
		Bank indian = new Bank(13,24000,2);
		
		System.out.println("print whether you need si or ci");
		String choice = sc.nextLine();
		if(choice.equalsIgnoreCase("si")) {
			icic.si();
			indian.si();
		}
		else
		{
			icic.ci();
			indian.ci();
		}
		
	}
}
