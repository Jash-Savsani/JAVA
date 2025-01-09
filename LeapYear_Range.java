import java.util.Scanner;

class LeapYear_Range{
	public static void main(String[] args){
		LeapYear_Range ob = new LeapYear_Range();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter y1 & y2 as for year:");
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();
		ob.Leap_Range(y1,y2);//non-static mathod call with object.
	}
	public void Leap_Range(int a, int b){//this is non-static method
		for(a=a+1; a<b; a++){
			if((a%4==0 && a%100!=0)||(a%400==0)){
				System.out.println(a+" is Leap Yeap.");
			}
		}
	}

}