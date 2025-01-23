//DAIMOND PATTERN
import java.util.Scanner;
class Lab5B6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Pattern:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int k=1;k<=n-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		for(int i=n-1;i>=1;i--){
			for(int k=1;k<=n-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.print("\n");
		}


	}
}