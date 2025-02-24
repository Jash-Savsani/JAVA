/*Write a program to prove that String is immutable and StringBuffer is immutable.*/
import java.util.Scanner;
class Str_Rev2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String:");
		String s1 = sc.nextLine();
		System.out.print("Enter a StringBuffer:");
		StringBuffer s2 = new StringBuffer(sc.nextLine());
		System.out.println("Reverse String is:"+myRevStr(s1));
		System.out.println("Reverse StringBuffer is:"+s2.reverse());
		System.out.println("Now Original String is:"+s1);//Here Original s1 String is not Change after perform String methods so, String is immutable.
		System.out.println("Now Original StringBuffer is:"+s2);//Here Original s2 StringBuffer is change After perform StringBuffer Methids so, StringBuffer is mutable. 

	}
	static String myRevStr(String s){
		String rev = "";
		for(int i=s.length()-1;i>=0;i--){
			rev += s.charAt(i);
		}
		return rev;
	}

}