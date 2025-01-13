import java.util.Scanner;
class Pattern4{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number:");
		int n = sc.nextInt();
		int i,j,k;
		for(i=1;i<=n;i++){
			for(k=1;k<=n-i;k++){
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++){
				if(j==1 || j==2*i-1){
					System.out.print("* ");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		for(i=4;i>=1;i--){
			for(k=1;k<=n-i;k++){
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++){
				if(j==1 || j==2*i-1){
					System.out.print("* ");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}