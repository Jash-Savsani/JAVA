/*Write a program in java if number is less than 10 and greater than 50, \
it generate the exception out of range. Else it displays the square of number.*/
import java.util.Scanner;
class OutOfRangeException extends Exception{
	OutOfRangeException(String msg){
		super(msg);
	}
}
class Lab10C5{
	public static void main(String[] args) throws Exception {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Number Between 10 to 50:");
			int n=sc.nextInt();
			if(n<10){
				throw new OutOfRangeException(n+" is Out of Range.");
			}else if(n>50){
				throw new OutOfRangeException(n+" is Out of Range.");
			}else{
				System.out.print("Square of "+n+" is:"+(n*n));
			}
		}	
}