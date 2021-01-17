/*5.Create a class with a method that prints "This is parent class" and 
   its subclass with another method that prints "This is child class.Now,
   create an object for each of the class and call
 * 1-method of parent class by object of parent class.
 * 2-method of child class by object of child class.
 * 3-method of parent class by object of child class.
 */


class Parent
{
	void method1()
	{
		System.out.println("This is Parent class");
	}
}
class Child extends Parent
{
	void method2() 
	{
		System.out.println("This is Child class");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Parent obj1 = new Parent();
		Child obj2 = new Child();
		obj1.method1();//calling method of parent class by object of parent class
		obj2.method2();//calling method of child class by object of child class
		obj2.method1();//calling method of parent class by object of child class
		
	}

}

/*---OUTPUT---
This is Parent class
This is Child class
This is Parent class
*/
