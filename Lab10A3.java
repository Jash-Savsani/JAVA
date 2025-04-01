/*Write a java program to create Custom Exception ( DarshanUniException). 
Catch this exception using throw clause and print appropriate message.*/
import java.util.Scanner;
class DarshanUniException extends Exception{
	DarshanUniException(String msg){
		super(msg);
	}
}
class Lab10A3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name="Darshan";

		do{
			System.out.print("Enter Your University Name(Darshan OR Marwadi):");
			name = sc.nextLine();
			try{
				if(name.equals("Darshan")){
					throw new DarshanUniException("Congrtulation For Take Addmission in Darshan University.");
				}
				else{
					System.out.println();
					System.out.println();
					System.out.println();
				}
			}catch(Exception e){// Here 'e' means DarshanUniException na Constructor ma Lakhel msg che. 
				// System.out.println(e);
				e.printStackTrace();
				return ;
			}
		}while(true);
	}	
}

