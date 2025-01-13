import java.util.Scanner;
class ForLoop2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number n :");
		int n=sc.nextInt();
		int sum1=0,sum2=0,i;
		for(i=1;i<=n;i++)
		{
			if(i%2==0){//even sum
				sum2+=i;
			}
			else{//odd sum
				sum1+=i;
			}
		}
		System.out.println("Sum of Odd Numbers From 1 to "+n+" is: "+sum1);
		System.out.println("Sum of Even Numbers From 1 to "+n+" is: "+sum2);
	}
}