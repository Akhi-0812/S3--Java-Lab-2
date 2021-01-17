/* 1.Write a java class having overloaded methods to calculate area of
     rectangle and circle.
 */
class Area{
	double a;
	void Area1(double r) {
		a = (r*r*22)/7;
		System.out.println("Area of circle = " + a);
	}
	void Area1(double l,double b) {
		a = l*b;
		System.out.println("Area of rectamgle = "+ a);
	}
}
public class MethodOverload {

	public static void main(String[] args) {
		Area obj = new Area();
		obj.Area1(1);
		obj.Area1(2,4);
		
	}

}
/*---OUTPUT---
Area of circle = 3.142857142857143
Area of rectamgle = 8.0
*/