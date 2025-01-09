import java.util.Scanner;

class lab3B7{
	public static void main(String[] args){
		lab3B7 ob = new lab3B7();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int a = sc.nextInt();
		ob.palindrome(a);
	}
		public void palindrome(int n){//this is non-static user define method.
			int b=n;	
			int r,rev;
			for(rev=0 ;n>0; n/=10){//other stopping condition like ==> n!=0 is also true.
				r=n%10;
				rev = rev*10 + r; 
			}
			if(rev==b){
				System.out.print(rev+" is palindrome number.");
			}
			else{
				System.out.print(rev+" is not palindrome number.");
			}		
		}
	}
