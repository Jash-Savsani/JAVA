//WAP to find whether string is palindrome or not.
import java.util.Scanner;
class Pro2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String:");
		String n =sc.nextLine();
		int k=n.length();
		String m="";
		char j;
		for(int i=k-1;i>=0;i--){
			m+=n.charAt(i);//how it's use I don't Know.

		}
		if(n.equals(m)){
			System.out.print(m+" is Palindrome.");
		}
		else{
			System.out.print(m+" is not Palindrome.");
		}
		

	}
}