import java.util.Scanner;

class lab3A5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int n = sc.nextInt();
		boolean flag = true;
		for(int i=2; i<n ; i++){
			if(n%i==0){
				flag = false;
				break;
			}
		}
		if(flag){// in condition (flag) is equals to (flag==true)
			System.out.print(n+" is Prime Number.");	
		}
		else{
			System.out.print(n+" is Composite Number.");
		}

	}
}