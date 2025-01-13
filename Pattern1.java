import java.util.Scanner;
class Pattern1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number:");
		int n=sc.nextInt();
		int i,j,k;
		for(i=n;i>=1;i--){
			for(k=1;k<=n-i;k++){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		for(i=2;i<=n;i++){
			for(k=1;k<=n-i;k++){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}