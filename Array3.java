import java.util.Scanner;//sum of Array elements
class Array3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int sum=0;
		for(int i=0;i<a.length;i++){
			System.out.print("Enter a["+i+"]:");
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		System.out.print("Summision of all Elements of Array is: "+sum);
	}
}