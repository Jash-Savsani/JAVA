import java.util.Scanner;
class Rect{
	double height;
	double width;
	void setVal(double h,double w){//this is Setter Method
		height=h;
		width=w;
	}
	double getVal(){//this is Getter Method
		return height*width; 
	}
}
class RectDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rect r1 = new Rect();
		Rect r2 = new Rect();
		System.out.print("Enter Height and Width of Rectangle r1:");
		double hi = sc.nextDouble();
		double wi = sc.nextDouble();
		r1.setVal(hi,wi);
		double ans=r1.getVal();
		System.out.println("Area of Rectangle r1 is: "+ans);
		System.out.print("Enter Height and Width of Rectangle r2:");
		hi = sc.nextDouble();
		wi = sc.nextDouble();
		r2.setVal(hi,wi);
		System.out.print("Area of Rectangle r2 is: "+r2.getVal());/*we can direct print callind method , 
		which return double value, so it's put direct double value without storing in variable.*/ 
	}
}