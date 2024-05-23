package oops1;
class Student
{
	//A Java class which is a fully encapsulated class.  
	//It has a private data member and getter and setter methods.  
	private String name;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
}

public class encapsulationex {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("indu");
		System.out.println(s.getName());
	}

}
