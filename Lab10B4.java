/*Write a Java program that divides two numbers. If Num1 or Num2 were not an integer, the program would throw a Number Format Exception. If Num2 were Zero, the program would throw an Arithmetic Exception. Display appropriate message for each exception.*/
import java.util.Scanner;
class Lab10B4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number && 2nd Number:");
		try{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c=a/b;	
		}catch(NumberFormatException e){
			System.out.print(e);
		}catch(ArithmeticException e){
			System.out.print(e);
		}catch(Exception e){
			System.out.print(e);
		}
		System.out.print("\n\nHello");
	}
}