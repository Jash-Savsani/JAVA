import java.util.Scanner;

class Lab4A1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Line:");
		String sen = sc.nextLine();
		int v=0,co=0;
		char c;
		for(int i=0;i<sen.length();i++){
			c=sen.charAt(i);
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
				v++;
			}
			else if(c==' '){

			}
			else{
				co++;
			}
		}
		System.out.println("Total Vowels in Given Line is: "+v);
		System.out.println("Total Consonants in Given Line is: "+co);
	}
}