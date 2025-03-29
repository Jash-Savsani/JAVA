/*Write a program to demonstrate Arithmetic Exception and ArrayIndexOutOfBounds Exception using try-catch block.*/
import java.util.Scanner;
class Lab10A1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,ans;//Enter a=15 b=0
		int[] arr = new int[5];
		System.out.print("Enter a:");
		a = sc.nextInt();
		System.out.print("Enter b:");
		b = sc.nextInt();
		try{
			ans=a/b;
		}
		catch(ArithmeticException e){
			System.out.println(e.toString());
		}
		System.out.println("*-*-*-*-*-*-*-*-*-*-Jash.");
		System.out.println("Here arr have size of 5.");
		System.out.print("Enter value for arr[6]:");
		try{
			arr[6] = sc.nextInt();
		} 
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.toString());
		}
		System.out.println("*-*-*-*-*-*-*-*-*-*-Savsani.");
	}
}