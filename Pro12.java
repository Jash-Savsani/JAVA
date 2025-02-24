/*WAP to find Max, Min, Average of n numbers, n should be taken from user and all n value
should be taken from user (Note that you are not allowed to use an array for this)*/
import java.util.Scanner;
class Pro12{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter How many Numbers You Want to Take:");
		int n = sc.nextInt();
		int num,max=0,min=0,sum=0;
		for(int i=1;i<=n;i++){
			System.out.print("Enter "+i+" Number: ");
			num=sc.nextInt();
			if(i==1){
				max=num;
				min=num;
			}
			else{
				if(num>max){
					max=num;
				}
				if(num<min){
					min=num;
				}
			}
			sum+=num;
		}
		double avg = (double) sum/n;
		System.out.println("\n\nMaximum From Given Number is: "+max);
		System.out.println("Minimum From Given Number is: "+min);
		System.out.println("Average of Given Number is: "+avg);

	}
}