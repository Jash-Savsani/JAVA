import java.util.Scanner;//Dynamic Size of Array
class Array2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Elements in Array:");
		int size= sc.nextInt();
		int a[]= new int[size];
		for(int i=0;i<a.length;i++){
			System.out.print("Enter a["+i+"]:");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}