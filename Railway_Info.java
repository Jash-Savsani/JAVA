/*Write a Java program to create a class called "RailwayReservation" with attributes for reservation PNRno,
 customer name, and age. Create 3 instances of customer c1,c2, and c3. Create parameterized constructor with 3 
 parameters and call display() to print all the information of c1,c2 and c3 respectively.*/
import java.util.Scanner;
class RailwayReservation{
	long PNRno;
	String customer_name;
	int age;
	RailwayReservation(long PNRno, String customer_name, int age){
		this.PNRno=PNRno;
		this.customer_name=customer_name;
		this.age=age;
	}
	void display(){
		System.out.println("Given Customer PNR Number==> "+PNRno);
		System.out.println("Given Customer Name==> "+customer_name);
		System.out.println("Given Customer Age==> "+age+"\n\n");
	}
}
class Railway_Info{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter c1 PNRno. , Name , Age : ");
		RailwayReservation c1 = new RailwayReservation(sc.nextLong(),sc.next(),sc.nextInt());
		System.out.print("Enter c2 PNRno. , Name , Age : ");
		RailwayReservation c2 = new RailwayReservation(sc.nextLong(),sc.next(),sc.nextInt());
		System.out.print("Enter c3 PNRno. , Name , Age : ");
		RailwayReservation c3 = new RailwayReservation(sc.nextLong(),sc.next(),sc.nextInt());
		System.out.print("\n\nFor c1:\n");
		c1.display();
		System.out.print("For c2:\n");
		c2.display();
		System.out.print("For c3:\n");
		c3.display();
	}
}