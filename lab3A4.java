import java.util.Scanner;
//Write a program to find maximum no from given 3 no.(without if-else).
class lab3A4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number:");
		int a = sc.nextInt();
		System.out.print("Enter Second Number:");
		int b = sc.nextInt();
		System.out.print("Enter Third Number:");
		int c = sc.nextInt();
		int x = ((a>b)?((a>c)?(a):(c)):((b>c)?(b):(c)));
		System.out.print(x+" is Largest Number.");
	}

}