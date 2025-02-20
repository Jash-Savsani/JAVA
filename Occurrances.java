/*Write a java program to find occurrences of entered char from a String.
e.g.: “Darshan University”
Occurrence of 'a'=2*/
import java.util.Scanner;
class Occurrances{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String:");
		String s = sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='A' || s.charAt(i)=='a'){
				count++;
			}
		}
		System.out.print("Total Occurrences of 'a' is: "+count);
	}
}