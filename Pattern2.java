import java.util.Scanner; 
class Pattern2{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a Number:");
		int n =sc.nextInt();
		int count=1,i,j;
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print(count+" ");
				count++;
			}
			System.out.print("\n");
		}
	}
}