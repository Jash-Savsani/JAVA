import java.util.Scanner;
class Lab4A2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array:");
		int size=sc.nextInt();
		int sum=0;
		int[] a = new int[size];
		for(int i=0;i<a.length;i++){
				System.out.print("Enter a["+i+"]:");
				a[i]=sc.nextInt();
				sum+=a[i];
		}
		float avg = (float) sum/size;
		System.out.print("Anerage of Given Array is: "+avg);
	}
		
}