package oops1;
class Company{
	String name;
	int id;
	static String comp = "tcs";
//	A static method can access static data member and can change the value of it.
	static void change()
	{
		comp = "infosys";
	}
	Company(String name,int id)
	{
		this.name = name;
		this.id = id;
		
	}
	void display()
	{
		System.out.println("name is "+name+" "+"id is "+id+" "+"company is " + comp);
	}
	   
	
}
//A static method can be invoked without the need for creating an instance of a class
/*
 * The static method can not use non static data member or call non-static method directly.
this and super cannot be used in static context.
class A{  
 int a=40;//non static  
   
 public static void main(String args[]){  
  System.out.println(a);  
 }  
}        
 */
public class statickey {
	 
	public static void main(String[] args) {
//		Variable (also known as a class variable)
//		Method (also known as a class method)
//		Block
//		Nested class
		Company c1 = new Company("giri",234);
		Company c2 = new Company("indu",235);
		c1.display();
		c2.change();
		c2.display();
		
	}

}
