import java.util.Scanner;
//Write a program to find length of string and print second half of the string.
class Lab4B4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String:");
		String s=sc.nextLine();
		int a=s.length();
		char j;
		System.out.println("Given String Length is: "+a);
		System.out.println("Second Half of the String is:");
		for(int i=(a/2);i<s.length();i++){
			j=s.charAt(i);
			System.out.print(j);
		}

	}
}
