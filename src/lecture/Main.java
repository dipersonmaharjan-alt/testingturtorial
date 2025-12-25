package lecture;

//class Animal {
//
//    String name;
//    int age;
//    
//    Animal (String name, int age){
//    	
//    	this.name = name;
//    	this.age = age;
//    	
//    	System.out.println("Printing from Animal");
//    }
//}
//
//class Dog extends Animal {
//    private String breed;
//    Dog(String name, int age, String breed){
//    	
//    	this.breed = breed;
//    	super(name, age);
//    	System.out.println("I am from Dog");
//    }
//    
//    void displaydata() {
//    	System.out.println("Name: "+ name + "\nage: " + age + "\nBreed: "+ breed );
//    }
//
//}
//
//public class Main {
//    public static void main(String[] args) {
//    	Dog d = new Dog("Goldy", 10, "GermanSherpard");
//    	d.displaydata();
//    }
//}

//Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). 
//Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area 
//and perimeter of a circle. 

//class Shape{
//
//	double getPerimeter(double r) {
//		return 0.0;
//	}
//	 double getArea(double r) {	
//		return 0.0;
//	}
//}
//class Circle extends Shape{
//	@Override
//	double getPerimeter(double r){
//		double p = (2* (22.0/7) *r);
//		return p;
//	}
//	@Override
//	double getArea(double r) {
//		double p = 2 * r * r;
//		return p;
//	}
//}
//
//public class Main{
//	public static void main(String[] args) {
//		Circle c = new Circle ();
//		System.out.println("The area of Circle is:" + c.getArea(4));
//		System.out.println("The area of Perimeter is:" + c.getPerimeter(4));
//	}
//}


//Extend the Animal and Dog example by adding a constructor to the Animal class that takes a name parameter. 
//In the Dog class, use the super keyword to call the constructor of the Animal class. Create instances of Dog 
//and demonstrate the use of the super keyword. 

class Animal {
	private String name ;
	Animal(String name){
		this.name = name;
		System.out.println("Animal consturctor name: " + name);
	}
	public String getname() {
		return this.name;
	}
}
class Dog extends Animal{
	Dog(String name){
		super(name);
	}
}
public class Main{
	public static void main (String[] args) {
		Dog d = new Dog("Hero");
		
	}
}


/*Create a class Person with a protected attribute address. Extend it with a subclass Employee that adds a department 
 * attribute. Demonstrate how the protected keyword allows access to the address property in the Employee subclass. 
 */

//class Person{
//	protected String address;
//	
//	Person(String address) {
//		this.address = address;
//	}
//	
//}
//class Employee extends Person{
//	protected String department;
//	Employee(String address,String department ){
//		super(address);
//		this.department=department;
//	}
//	
//	void showdetails() {
//		System.out.println("This is address :"+ address + "\nThis is Department:"+ department );
//	}
//}
//public class Main{
//	public static void main(String[] args) {
//		Employee e = new Employee("Biratnagar", "IT");
//		e.showdetails();
//	}
//}

/*Create class Parent with a private variable, a protected variable, and a public variable. 
 * Create a subclass Child and demonstrate how each type of variable is accessed (or not accessed) within the subclass. 
 */

//class Parent{
//	private String pvar = "Private Variable";
//	protected String provar = "Protected Variable";
//	public String publicvar = "Public Variable";
//	
//	public String getpvar() { // Private variable accessed through getter method
//		return pvar;
//	}
//}
//
//class Child extends Parent{
//	void viewdetails() {
//		System.out.println("This is private variable :"+ getpvar());
//		System.out.println("This is protected variable:" + provar);
//		System.out.println("This is public variable:"+ publicvar );
//	}
//}
//public class Main{
//	public static void main (String[] args) {
//		Child c = new Child();
//		c.viewdetails();
//	}
//}

/*Create a final class FinalClass. Attempt to extend it with another class and observe the compiler error. 
Also, create a final method within a class and try to override it in a subclass. 
*/
//final class FinalClass{
//	final void glass(){
//		System.out.println("This is Final Class");
//	}
//}
//class Animal extends FinalClass{
//	@Override
//	final void glass(){
//		System.out.println("This is Final Class");
//	}
//}
//
//public class Main {
//	public static void main(String[] args) {
//		Animal a = new Animal();
//	}
//}



////import java.util.Scanner;
//class Solution {
//    public boolean isPowerOfThree(int n) {  
//    	int a = 0;
//    	for (int i = 0; i<=n; i++) {
//			if (n == a) {
//				return true;
//			}
//			else if (n==0){
//				return false;
//			}
//			else {
//				a =i*3;
//			}
//			
//    	}
//		return false;
//    }
//}
//
//public class Main{
//	public static void main (String[] args) {
//		Solution s=  new Solution();
//		s.isPowerOfThree(3); 
//		
//		
//	}
//}



















