import java.util.Scanner;
class Cube{
	double height;
	double width;
	double depth;
	void Setter(double h,double w,double d){
		height=h;
		width=w;
		depth=d;
	}
	void Getter(){
		System.out.println("Volume of Given Cube is: "+(height*width*depth));
	}
}
class CubeDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cube c1 = new Cube();
		Cube c2 = new Cube();
		System.out.print("Enter Height, Width, Depth of c1 Cube:");
		double h = sc.nextDouble();
		double w = sc.nextDouble();
		double d = sc.nextDouble();
		c1.Setter(h,w,d);
		c1.Getter();
		System.out.print("Enter Height, Width, Depth of c2 Cube:");
		h = sc.nextDouble();
		w = sc.nextDouble();
		d = sc.nextDouble();
		c2.Setter(h,w,d);
		c2.Getter();
	}
}