import java.util.Scanner;
class Pro15{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,n,r;
	long ans=0,rev=0;
	// printf("Enter 'Decimal Number':");
	// scanf("%d",&n);
	System.out.print("Enter 'Decimal Number':");
	n=sc.nextInt();
	for(i=0;n>0;i++)
	{
		r=n%2;
		rev=rev*10 + r;
		n=n/2;
	}
	//printf("Given Number in 'Binary' is:");
	System.out.print("Given Number in 'Binary' is: ");
	for(i=0;rev>0;i++)
	{
		r=(int)rev%10;
		System.out.print(r);
		rev=rev/10;
	}

	}
	
}