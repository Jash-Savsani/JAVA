import java.util.Scanner;
class Student{
	String name;
	int sem;
	double cpi;
	Student(){//this is CONSTRUCTOR
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Name:");
		String name = sc.nextLine();
		System.out.print("Enter Your Semester:");
		int sem = sc.nextInt();
		System.out.print("Enter Your CPI:");
		double cpi = sc.nextDouble();
		this.name=name;
		this.cpi=cpi;
		this.sem=sem;

	}
	void diplyStu(){
		System.out.print("Student Name: "+name+"\nStudent Semester: "+sem+"\nStudent CPI: "+cpi);
	}
}

class Demo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		s1.diplyStu();	
	}
}