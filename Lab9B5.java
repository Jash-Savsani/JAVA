/*Write a Java program to create an interface Shape with the getArea() method. 
Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. 
Implement the getArea() method for each of the three classes. [B]*/
import java.util.Scanner;
interface Shape{
	void getArea();
}
class Rectangle implements Shape{
	Scanner sc = new Scanner(System.in);
	Rectangle(){
		getArea();
	}
	public void getArea(){
		System.out.print("\nRectangle:\nEnter Length:");
		double length = sc.nextDouble();
		System.out.print("Enter Width:");
		double width = sc.nextDouble();
		System.out.print("Rectangle Area:"+(length*width));
	}
}
class Circle implements Shape{
	Circle(){
		getArea();
	}
	Scanner sc = new Scanner(System.in);
	public void getArea(){
		System.out.print("\nCircle:\nEnter Radius:");
		double radius = sc.nextDouble();
		System.out.print("Circle Area:"+(Math.PI*radius*radius));
	}
}
class Triangle implements Shape{
	Triangle(){
		getArea();
	}
	Scanner sc = new Scanner(System.in);
	public void getArea(){
		System.out.print("\nTriangle:\nEnter Base:");
		double base = sc.nextDouble();
		System.out.print("Enter Vedh:");
		double vedh = sc.nextDouble();
		System.out.print("Triangle Area:"+(0.5*base*vedh));
	}
}
class Lab9B5{
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		Triangle t = new Triangle();
	}
}