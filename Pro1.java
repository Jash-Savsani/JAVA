//WAP to find a sum of even number into 1D array.
import java.util.Scanner;
class Pro1{
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter Number of Elements in Array:");
		int n= sc.nextInt();
		int a[] = new int[n];
		int sum=0;
		for(int i=0; i<n;i++){
			System.out.print("Enter a["+i+"]:");
			a[i] = sc.nextInt();
			if(a[i]%2==0){//evenNum
				sum+=a[i];
			}
		}
		System.out.print("Sum of Even Num in 1D array is: "+sum);
	}
}