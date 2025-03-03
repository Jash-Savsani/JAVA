/*WAP to calculate an angle between hour and minute hand. 
(Hours and minutes should be taken from user).*/
import java.util.Scanner;
class Pro14{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Houe with Minute : ");
		int h = sc.nextInt();
		int m = sc.nextInt();
		int ans = (h*60)-(m*11);
		ans/=2;
		if(ans>90){
			ans=(360-ans);
		} 
		System.out.print("Angle Between "+h+" Hour and "+m+" Minute is : "+ans+"*");
	}
}