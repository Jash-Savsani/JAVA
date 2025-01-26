//WAP to find a Factor of a given number (iterative and recursive)
import java.util.Scanner;
class Pro3{
	int i=2;
	public static void main(String[] args) {
		Pro3 j= new Pro3(); 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int n =sc.nextInt();
		System.out.print("Factors of n is: 1 ");

		j.Factors(n);
		// for(int i=2;i<n;i++)//Iterative
		// {
		// 	if(n%i==0){
		// 		System.out.print(i+" ");
		// 	}
		// }
		System.out.print(n);
	}
	void Factors(int n)//Recursive
	{
		if(n==i){
			return;
		}
		else if(n%i==0){
			System.out.print(i+" ");
		}
		else{

		}
		i++;
		Factors(n);

	}
}