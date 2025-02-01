import java.util.Scanner;
class Time{
	Scanner sc = new Scanner(System.in);
	int h,m,s;
	Time(){
		System.out.print("Enter Hour: ");
		int h = sc.nextInt();
		System.out.print("Enter Minute: ");
		int m = sc.nextInt();
		 System.out.print("Enter Second: ");
		 int s = sc.nextInt();
		 this.h=h;
		 this.m=m;
		 this.s=s;
	}
	void Addition(int h1, int m1, int s1,int h2, int m2, int s2)
	{
		int s,m,h;
		if(s1+s2>60){
			s=(s1+s2)-60;
			m1++;
		}
		else{
			s=s1+s2;
		}
		if(m1+m2>60){
			m=(m1+m2)-60;
			h1++;
		}
		else{
			m=m1+m2;
		}
		h=h1+h2;
		System.out.print("\n\nAddition of Two Time is:\nTotal Hour: "+h+"\nTotal Minute :"+m+"\nTotal Second :"+s);
	}
}
class Lab6A2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("For t1:");
		Time t1 = new Time();
		System.out.println("For t2:");
		Time t2 = new Time();
		t2.Addition(t1.h,t1.m,t1.s,t2.h,t2.m,t2.s);
	}
}