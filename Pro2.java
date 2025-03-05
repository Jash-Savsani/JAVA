import java.util.Scanner;
class Cube{
	double height;
	double width;
	double depth;
	void setter(double height,double width,double depth){
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	void getter(){
		System.out.println("Cube Height:"+height);
		System.out.println("Cube Widht:"+width);
		System.out.println("Cube Depth:"+depth);
	}
	double volume(){
		return (height*width*depth);
	}
}
class Pro2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double height;
		double width;
		double depth;
		Cube c1 = new Cube();
		Cube c2 = new Cube();
		System.out.print("Enter Height for c1:");
		height = sc.nextDouble();
		System.out.print("Enter Widht for c1:");
		width = sc.nextDouble();
		System.out.print("Enter Depth for c1:");
		depth = sc.nextDouble();
		c1.setter(height,width,depth);
		c1.getter();
		double ans1=c1.volume();
		System.out.println("Volume of c1:"+ans1);
		System.out.print("Enter Height for c2:");
		height = sc.nextDouble();
		System.out.print("Enter Widht for c2:");
		width = sc.nextDouble();
		System.out.print("Enter Depth for c2:");
		depth = sc.nextDouble();
		c2.setter(height,width,depth);
		c2.getter();
		double ans2=c2.volume();
		System.out.println("Volume of c2:"+ans2);
	}
}

