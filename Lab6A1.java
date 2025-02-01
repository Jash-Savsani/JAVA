/*Write a program to create circle class with area function to find area of circle.*/
import java.util.Scanner;
class Circle{
	double r;
	void area(double r){
		System.out.print("\nArea of Circle is: "+(r*r*3.14));/*Here Scope of 'r' is Local within area Function*/
	}

}
class Lab6A1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c = new Circle();
		System.out.print("Enter a Radius of Circle:");
		double r=sc.nextDouble();
		c.area(r);
	}
}