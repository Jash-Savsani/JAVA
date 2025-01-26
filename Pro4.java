//WAP to find a factorial of a given integer (iterative and recursive)
import java.util.Scanner;
class Pro4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pro4 j = new Pro4();
		System.out.print("Enter Number: ");
		int n =sc.nextInt();
		int ans2=1;
		for(int i=1;i<=n;i++){//iterative
			ans2*=i;
		}
		System.out.print("Factorial of "+n+" is: "+ans2);
		// int ans=j.Fact(n);
		// System.out.print("Factorial of "+n+" is: "+ans);
	}
	// int Fact(int n){//recrusive
	// 	if(n==0 || n==1){
	// 		return 1;
	// 	}
	// 	else{
	// 		return n*Fact(n-1);
	// 	}
	// }
}