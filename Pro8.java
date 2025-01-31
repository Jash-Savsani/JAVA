//WAP to find a total odd and total even digit of a given number.
import java.util.Scanner;
class Pro8{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int e=0,o=0;
		long n = sc.nextLong();
		long m,r;
		m=n;
		for(;n>0;){
			r=n%10;
			if(r%2==0){
				e++;
			}
			else{
				o++;
			}
			n/=10;
		}
		System.out.println(m+" have total "+e+" even digit.");
		System.out.print("and "+m+" have total "+o+" odd digit.");

	}
}