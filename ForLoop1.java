import java.util.Scanner;
class ForLoop1{
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number n :");
		int n=sc.nextInt();
		int sum=0,i;
		for(i=1; i<=n;i++)
		{
			sum+=i;
		}
		System.out.print("Sum of 1 to "+n+" is: "+sum);
	}
}	