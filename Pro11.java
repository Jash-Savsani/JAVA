import java.util.Scanner;
class Pro11{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int n = sc.nextInt();
		int digit=0,r,i,m,o,ans,sum=0;
		m=n;
		o=n;
		for(;n>0;)
		{
			++digit;
			n/=10;
		}
		for(;m>0;)
		{
			ans=1;
			r=m%10;
			for(i=1;i<=digit;i++)
			{
				ans*=r;
			}
			sum+=ans;
			m/=10;
		}
		if(o==sum)
		{
			System.out.print(o+" is Armstrong Number.");
		}
		else
		{
			System.out.print(o+" is not Armstrong Number.");
		}
	}
}