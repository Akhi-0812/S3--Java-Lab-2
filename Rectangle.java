
/*4.Write a program to print the area of a rectangle by creating a class named 'Area'
taking the values of its length and breadth as parameters of its constructor and
having a method named 'returnArea' which returns the area of the rectangle.Length 
and breath of rectangle are entered through keyboard.
*/

import java.util.Scanner;
class Area{
int length,breadth;
public Area(int l, int b) {
	length = l;
	breadth = b;
}
public int returnArea() {
	return length*breadth;
}
}
	public class Rectangle {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the length");
			int l = sc.nextInt();
			System.out.println("Enter the breadth");
			int b = sc.nextInt();
			Area a = new Area(l,b);
			System.out.println("Area of rectangle : " + a.returnArea());
		}

	}
	/*---OUTPUT---
	Enter the length
	2
	Enter the breadth
	3
	Area of rectangle : 6
    */