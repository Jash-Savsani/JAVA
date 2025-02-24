import java.util.Scanner;//for square matrix.
class Pro13{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of 2-D Array:");
		int size= sc.nextInt();
		int a[][]= new int[size][size];
		int b[][]= new int[size][size];
		int c[][]= new int[size][size];
		System.out.println("First Matrix:");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				System.out.print("Enter a["+i+"]["+j+"]:");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Second Matrix:");
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b.length;j++){
				System.out.print("Enter b["+i+"]["+j+"]:");
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c.length;j++){
				for(int k=0;k<c.length;k++){
					c[i][j]+=(a[i][k]*b[k][j]);
				}
			}
		}
		System.out.println("Multiply of First and Second Matrix is:");
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b.length;j++){
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}
}