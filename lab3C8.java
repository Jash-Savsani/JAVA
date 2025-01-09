import java.util.Scanner;

class lab3C8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter r1 and r2:");
		int r1=sc.nextInt();
		int r2=sc.nextInt();
		primeRange(r1,r2); 
	}
	public static void primeRange(int a, int b){
		int j;
		for(j=a; j<=b ; j++){
			int i;
			boolean flag=true;
			for(i=2; i<a; i++){
				if(a%i==0){
					flag=false;
					break;
				}
			}
			if(flag==true){
				System.out.print(a+" ");
			}
			a++;
		}
	}

}