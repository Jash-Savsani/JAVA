//WAP to find a summation of a digit of a given number. (Iterative and recursive)
import java.util.Scanner;
class Pro5{
	public static void main(String[] args) {
		Pro5 j = new Pro5();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Num: ");
		int n = sc.nextInt();
		int m=n;
		int ans=j.Sum(n);
		System.out.print("summation of a digit of a "+m+" is: "+ans);
	// 	int m=n;
	// 	int r,sum=0;
	// 	for(int i=1;n>0;i++){//Iterative
	// 		r=n%10;
	// 		sum+=r;
	// 		n=n/10;
	// 	}
	// 	System.out.print("summation of a digit of a "+m+" is: "+sum);
	 }
	 int Sum(int n){//Recursive
	 	int r;
	 	r=n%10;
	 	if(n==0){
	 		return 0;
	 	}
	 	else{
	 		return r+Sum(n/10);
	 	}
	 }
}