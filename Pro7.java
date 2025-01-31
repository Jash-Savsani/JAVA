import java.util.Scanner;
class Pro7{
	void Fibbo(int n, int x, int y){//recursive
		int ans=x+y;
		System.out.print(" "+ans);
		if(n==0){
			return;
		}
		Fibbo(n-1,y,ans);

	}
	public static void main(String[] args) {
		Pro7 obj1 = new Pro7();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Ending Series:");
		int n=sc.nextInt();
		System.out.print("0 1");
		obj1.Fibbo(n,0,1);
	}
}
