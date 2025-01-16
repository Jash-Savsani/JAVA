//intro of 2D Array...
import java.util.Scanner;
class Two_D_Array{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Size of 2-D Array:");
		int size=sc.nextInt();
		int a[][]= new int[size][size];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				System.out.print("Enter a["+i+"]["+j+"]:");
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				System.out.print(a[i][j]+"\t");//or (a[i][j]+"  ");
			}
			System.out.println();
		}
	}
}