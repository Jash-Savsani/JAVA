/*Write a java program to input a string from user and convert into following format of alternate capital and small letter.
e.g.:
input:”darshanuniversity”
output: “DaRsHaNuNiVeRsItY”*/
import java.util.Scanner;
class AlterString{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String:");
		String s1 = sc.nextLine();
		String ans = "";
		for(int i=0;i<s1.length();i++){
			if(i%2==0){
				ans=ans+s1.toUpperCase().charAt(i);
			}
			else{
				ans=ans+s1.toLowerCase().charAt(i);
			}
		}
		System.out.print(ans);
	}
}