/*Write a java program to reverse a String using user defined method: String myRevStr(String originalStr) that returns reverse String.
Also reverse a String using StringBufferClass.*/
import java.util.Scanner;
class Str_Rev{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String:");
		String s1 = sc.nextLine();
		System.out.print("Enter a StringBuffer:");
		StringBuffer s2 = new StringBuffer(sc.nextLine());
		System.out.println("Reverse String is:"+myRevStr(s1));
		System.out.print("Reverse StringBuffer is:"+s2.reverse());
	}
	static String myRevStr(String s){
		String rev = "";
		for(int i=s.length()-1;i>=0;i--){
			rev += s.charAt(i);
		}
		return rev;
	}

}