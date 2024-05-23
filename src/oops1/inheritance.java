package oops1;

class Vehicle
{
	String type;
	int no;
	int tyrescount;
	Vehicle(String type,int no,int tyrescount)
	{
		this.type = type;
		this.no = no;
		this.tyrescount = tyrescount;
	}
	void wash()
	{
		System.out.println("washing vehicle");
	}
}
class Car extends Vehicle
{
	String name;
	double price;
	
	Car(String type, int no,String name,double price) {
		super(type, no,4);
		this.name = name;
		this.price = price;
	}
	void display()
	{
		System.out.println("type "+type);
		System.out.println("no "+no);
		System.out.println("name "+name);
		System.out.println("price "+price);	
	}
	void wash()
	{
		System.out.println("washing car");
	}
	
}

class Bike extends Vehicle
{
	String name;
	double price;
	Bike(String type, int no,String name,double price) {
		super(type, no,2);
		this.name = name;
		this.price = price;
	}
	void display()
	{
		System.out.println("type "+type);
		System.out.println("no "+no);
		System.out.println("name "+name);
		System.out.println("price "+price);
		
	}
}
public class inheritance {
	public static void main(String[] args) {
		Car c = new Car("car",23,"lamborgini",245090000);
		c.display();
		c.wash();
		Bike b = new Bike("Bike",34,"royal enfield",3400000);
		b.display();
		
		
	}

}
