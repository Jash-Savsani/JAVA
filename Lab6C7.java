/*Write a program in Java to demonstrate use of this keyword. 
Check whether this can access the Static variables of the class or not.*/
import java.util.Scanner;
class Check{
	int a;
	static int b;
	Check(int a, int b)
	{	
		this.a=a;
		this.b=b;//==>error only when occur when we write this.b=a inside constructor only.
	}
	void display(){
		System.out.println("this.b="+this.b);//from the output 'this' keyword can access the Static variables of the class by new JAVA Fexiblity Provides...
		System.out.println("this.a="+this.a);
		System.out.println("Check.b="+Check.b);
		
	}
}
class Lab6C7{
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a Number for Static Variable (b) and Non Static variable(a): ");
			int a =sc.nextInt();
			int b = sc.nextInt();
			Check c1 = new Check(a,b);
			c1.display();
			
	}
}
