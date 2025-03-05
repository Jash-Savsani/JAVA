import java.util.Scanner;
class Student{
	String name;
	int roll_no;
	double spi;
	String course;
	void setter(String name,int roll_no,double spi,String course){
		this.name=name;
		this.roll_no = roll_no;
		this.spi = spi;
		this.course = course;
	}
	void getter(){
		System.out.println("Student name:"+name);
		System.out.println("Student Roll No:"+roll_no);
		System.out.println("Student SPI:"+spi);
		System.out.println("Student Course:"+course);
	}
}
class Pro1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name:");
		String name = sc.nextLine();
		System.out.print("Enter Roll_No:");
		int roll_no = sc.nextInt();
		System.out.print("Enter SPI:");
		double spi = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter Course:");
		String course = sc.nextLine();
		Student s1 = new Student();
		s1.setter(name,roll_no,spi,course);
		s1.getter();
	}
}