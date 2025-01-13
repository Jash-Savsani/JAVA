import java.util.Scanner;
class ForLoop3{
	public static void main(String[] args) {
		System.out.print("How many Numbers For you want to Like Sum:");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int j,i,sum=0;
		for(i=1;i<=n;i++){
			System.out.print("Enter Number:");
			j=sc.nextInt();
			sum+=j;
		}
		System.out.print("Sum of total "+n+" numbers as per your choice is: "+sum);
	}
}