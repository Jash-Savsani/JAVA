import java.util.Scanner;
class Math{
	int Sum(int a){
		a+=5;
		return a;
	}
}	
class Method{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int c=sc.nextInt();
		Math m1 = new Math();
		int b=m1.Sum(c);
		System.out.println("c="+c);
		System.out.print("b="+b);		
	}
}