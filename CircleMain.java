import java.util.Scanner;
class Circle{
	void cirArea3(int r){
		System.out.println("Area of Circle is: "+(3.14*r*r));
	}
	static void cirArea4(int r){
		System.out.println("Area of Circle is: "+(3.14*r*r));
	}
}
class CircleMain{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CircleMain c1 = new CircleMain();
		Circle c2 = new Circle();
		System.out.print("Enter Radius: ");
		int n = sc.nextInt();
		c1.cirArea1(n);
		cirArea2(n);
		c2.cirArea3(n);
		Circle.cirArea4(n);
	}
	void cirArea1(int r){
		System.out.println("Area of Circle is: "+(3.14*r*r));
	}
	static void cirArea2(int r){
		System.out.println("Area of Circle is: "+(3.14*r*r));
	}
}