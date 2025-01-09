import java.util.Scanner;

class lab3B6{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Year:");
		int y = sc.nextInt();
		if((y%4==0 && y%100!=0)||(y%400==0)){//we can give many condition in If condition Using this Type..
			System.out.print(y+" is Leap Year.");
		}
		else{
			System.out.print(y+" is Leap not Year.");
		}
	}
}
