package oops1;
import java.util.*;

class Dog
{
	String name;
	int age;
	Dog(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	Dog(Dog d)//copy using constructor-copy the values of one object into another using Java constructor.
	{
		name =d.name;
		age = d.age;
	}
	void display()
	{
		System.out.println("dog name is " + name);
		System.out.println("dog age is " + age);
	}
}

public class copyconstructor {
	public static void main(String[] args) {
		Dog d = new Dog("mimi",3);
		Dog d2 = new Dog(d);
		d.display();
		d2.display();
		
	}

}
