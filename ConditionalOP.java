import java.util.Scanner;

class ConditionalOP{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter First Number:");
		int a= sc.nextInt();
		System.out.print("Enter Second Number:");
		int b= sc.nextInt();
		System.out.print("Enter Third Number:");
		int c= sc.nextInt();
		int x= (a>b)?(a>c)?(a):(c):(b>c)?(b):(c);
		System.out.print(x+" is largest number.");

	}
}