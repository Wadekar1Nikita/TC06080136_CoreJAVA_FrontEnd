//containment
public class Date {
	private int dd,mm,yy;

	public Date(int dd, int mm, int yy) {
		
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	public static void main(String args[])
	{
		Date d=new Date(19,10,2023);
	}
	

}
//...................................assignment1.................................
//create a class MathOperation with two data members X and Y to store the operand 
//and third data member R to store result of operation.
//create method member
//init-to input X and Y from users
//add-to add X and Y store in R
//multiply -to multiply X and Y and store in R
//power-to calculate x^y and store in R
//display-to display Result R

//..................................assigment2.......................................
//Create a class MathOperation containing method 'Multiply'to calculate multiplication of following arguments
//a.two integers
//b.three float
//c.all element of array
//d.one double and one integer
//..................................assignment3.........................................
//Create a class Person with properties (name and age)with following features
//a.default age of person should be 18
//A person object can be initialized with name and age
//Method to display name and age of Person
