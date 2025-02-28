/*WAP to find whether a number is Odd or Even without using a % operator.*/
import java.util.Scanner;
class Pro9{
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a Number:");
			int n =sc.nextInt();
			int m=n;
			if(n>0){//for even numbers
				while(n>=-1)
			{
				if(n==0){
					System.out.print(m+" is even number");
					break;
				}
				else if(n==-1){
					System.out.print(m+" is odd number");
					break;
				}
				n-=2;
			}
		}
		else{
			while(n<=1)
			{
				if(n==0){
					System.out.print(m+" is even number");
					break;
				}
				else if(n==+1){
					System.out.print(m+" is odd number");
					break;
				}
				n+=2;
			}
		}
	}
}