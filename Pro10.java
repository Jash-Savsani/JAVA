/*WAP to find a prime number between range (range should be entered by user).*/
import java.util.Scanner;
class Pro10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Range for Finding Prime Numbers between r1 and r2: ");
		int r1 = sc.nextInt();
		int r2 = sc.nextInt();
		boolean k;
		for(int j=r1;j<=r2;j++){
			k=true;
			for(int i=2;i<j;i++){
				if(j%i==0){//not prime condi.
					k=false;
					break;
					}
			}
			if(k==true){
				System.out.print(j+" ");
			}
		}
		
	}

}