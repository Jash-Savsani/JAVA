import java.util.Scanner;

class lab3A1{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Marks in DF:");
		int a = sc.nextInt();
		System.out.print("Enter Marks in BM-II:");
		int b = sc.nextInt();
		System.out.print("Enter Marks in PPT:");
		int c = sc.nextInt();
		System.out.print("Enter Marks in ENG:");
		int d = sc.nextInt();
		System.out.print("Enter Marks in OOPJ:");
		int e = sc.nextInt();
		float per =(float)(a+b+c+d+e)/5;// or double per = (a+b+c+d+e)/5.0;
		if(per>=60.0){
			System.out.print("Student Get First Division");
		} 
		else if(per<=59.0 && per>=50.0){
			System.out.print("Student Get Second Division");
		}
		else if(per<=49.0 && per>=40.0){
			System.out.print("Student Get Third Division");
		}
		else if(per<40.0){
			System.out.print("Student is Fail.");
		}
	}
}