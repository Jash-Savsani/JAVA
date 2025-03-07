/*Define class for Complex number with real and imaginary as data members. 
Create its constructor, overload the constructors. 
Also define addition method to add two complex objects.*/
import java.util.Scanner;
class ComplexNumber{
	Scanner sc = new Scanner(System.in);
	int realpart;
	int imaginarypart;
		ComplexNumber(){//for c1
		System.out.print("Enter Real Part for c1: ");
		int r = sc.nextInt();
		System.out.print("Enter Imaganary Part for c1: ");
		int i = sc.nextInt();
		realpart=r;
		imaginarypart=i;
		System.out.print("c1 = "+r+" + "+i+"i\n");
		}
		ComplexNumber(int r,int i){//for c2 || Overload Constructor with Dynamic Value
			realpart=r;
			imaginarypart=i;
			System.out.print("c2 = "+r+" + "+i+"i");
		}
		void addition(int r1, int r2, int i1, int i2){
			int r=r1+r2;
			int i=i1+i2;
			System.out.print("\n\nAddition of Two Complex Number is\n==> c1+c2= c = "+r+" + "+i+"i ");
		}
}
class Lab6B5{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ComplexNumber c1 = new ComplexNumber();
	System.out.print("Enter Real Part for c2: ");
	int r = sc.nextInt();
	System.out.print("Enter Imaganary Part for c2: ");
	int i = sc.nextInt();
	ComplexNumber c2 = new ComplexNumber(r,i);
	c2.addition(c1.realpart , c2.realpart, c1.imaginarypart , c2.imaginarypart);
	}	
}