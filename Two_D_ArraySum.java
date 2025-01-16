import java.util.Scanner;
class Two_D_ArraySum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of 2-D Array:");
		int size= sc.nextInt();
		int a[][]= new int[size][size];
		int b[][]= new int[size][size];
		int c[][]= new int[size][size];
		System.out.println("First 2D Array:");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				System.out.print("Enter a["+i+"]["+j+"]:");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Second 2D Array:");
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b.length;j++){
				System.out.print("Enter b["+i+"]["+j+"]:");
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c.length;j++){
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum of First and Second 2D Array is:");
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c.length;j++){
				System.out.print(c[i][j]+"     ");
			}
			System.out.println();
		}
	}
}