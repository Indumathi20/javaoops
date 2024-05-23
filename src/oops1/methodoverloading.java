package oops1;
//If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
//compiletime polymorphism

/*
 * There are two ways to overload the method in java

By changing number of arguments
By changing the data type
 * */

class Multiply
{
	static int mul(int a,int b,int c)
	{
		return a * b * c;
	}
	static int mul(int a,int b)//changing no of arguments
	{
		return a * b;
	}
	static double mul(double a,double b)//changes data type
	{
		return a * b;
	}
	
	
}
public class methodoverloading {
	public static void main(String[] args) {
			System.out.println(Multiply.mul(2, 3));
			System.out.println(Multiply.mul(2.4, 3.6));
			System.out.println(Multiply.mul(2, 3,8));
			System.out.println(Multiply.mul(2.3, 3));
			//Method Overloading and Type Promotion
			System.out.println(Multiply.mul(3, 'i'));//The char datatype can be promoted to int,long,float or double and so on.
	}

}
