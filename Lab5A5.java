import java.util.*;
class Lab5A5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a String:");
		String s=sc.nextLine();
		char c;
		for(int i=0;i<s.length();i++){
			for(int j=0;j<=i;j++){
				c=s.charAt(j);
				System.out.print(c);
			}
			System.out.println();
		}
	}
}