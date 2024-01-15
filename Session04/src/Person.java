//..................................assignment3.........................................
//Create a class Person with properties (name and age)with following features
//a.default age of person should be 18
//A person object can be initialized with name and age
//Method to display name and age of Person

public class Person {
	private String name;
	private int age=18;
	public Person() {}
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println("Person name:"+name);
		System.out.println("Person age:"+age);
	}
	public static void main(String args[])
	{
		Person p = new Person("Nikita",18);
		p.display();
		
	}
	

}
