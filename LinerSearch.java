import java.util.Scanner;
class LinerSearch{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array:");
		int n = sc.nextInt();
		int a[] = new int[n];
		boolean jash=false;
		for(int i=0;i<n;i++){
			System.out.print("Enter a["+i+"]:");
			a[i] = sc.nextInt();
		}
		System.out.print("Which Element Would you want to Find:");
		int find = sc.nextInt();
		for(int i=0;i<n;i++){
			if(a[i]==find){
				jash=true;
				System.out.print("Your Searching Element "+find+" is Present in Array, in a["+i+"] ");
				break;
			}
		}
		if(jash==false){
			System.out.print("Your Searching Element "+find+" is not Present in Array.");
		}
	}
}