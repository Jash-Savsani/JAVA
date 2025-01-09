import java.util.Scanner;

class lab3A2{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number:");
		int n = sc.nextInt();
		if(n%2==0){
			System.out.print(n+" is even number.");
		}
		else{
			System.out.print(n+" is odd number.");	
		}
	}
}