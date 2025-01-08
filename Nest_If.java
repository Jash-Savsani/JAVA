import java.util.Scanner;

class Nest_If{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter User Id:");
		String uid=sc.next();
		if(uid.equals("du")){
			System.out.print("Enter Password:");
			String pass=sc.next();
			if(pass.equals("bscs")){
				System.out.print("Welcome too Darshan University.");
			}
			else{
				System.out.print("Invalid Password.");
			}
		}
		else{
			System.out.print("Invalid UserID.");
		}
	}
}