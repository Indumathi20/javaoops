package oops1;
//If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship.
/*
 * Consider a situation, Employee object contains many informations such as id, name, emailId etc. 
 * It contains one more object named address,
 *  which contains its own informations such as city, state, country, zipcode etc. as given below
 */
class Address
{
	int dono,pincode;
	String city,state;
	Address(int dono,int pincode,String city,String state)
	{
		this.dono = dono;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
	}
}
class Employee
{
	int id;
	String name;
	Address ad;
	
	Employee(int id,String name,Address ad)
	{
		this.id = id;
		this.name = name;
		this.ad = ad;
	}
	void display() {
		System.out.println("id "+ id);
		System.out.println("name "+ name);
		System.out.println("dono "+ ad.dono);
		System.out.println("pincode "+ ad.pincode);
		System.out.println("city "+ ad.city);
		System.out.println("state "+ ad.state);
	}
	
}
public class aggregation {
	public static void main(String[] args) {
		Address a = new Address(23,620102,"tricy","tamilnadu");
		Employee e = new Employee(345,"indu",a);
		e.display();
		
	}

}
