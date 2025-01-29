import java.util.Scanner;
class Bubble_Short{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Elements in Array: ");
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter a["+i+"]:");
			a[i]=sc.nextInt();
		}
		for(int j=1;j<n;j++){
			for(int i=1;i<n;i++){
				if(a[i]<a[i-1]){
					a[i-1] = a[i-1] + a[i];
					a[i] = a[i-1] - a[i];
					a[i-1] = a[i-1] - a[i];
				}
			}
		}
		System.out.print("\n\nShorting of Array in Assending Order is:");
		for(int i=0;i<n;i++){
			System.out.print("\na["+i+"] is: "+a[i]);
		}
	}
		
}