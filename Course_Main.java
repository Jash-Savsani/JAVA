/*Write a Java program to create a class called "Course" with attributes for course name, 
instructor, and credits. Implement two constructor Course() to initialize default values 
and Course(Course object)-call by reference. Call display() to print all the information.*/
import java.util.Scanner;
class Course{
	String Course_Name;
	String Course_Instructor;
	double Course_Credits;
	Course(String Course_Name, String Course_Instructor, double Course_Credits){
		this.Course_Name=Course_Name;
		this.Course_Instructor=Course_Instructor;
		this.Course_Credits=Course_Credits;
	}
	Course(String cn, String ci ,Course c){
		this.Course_Name=cn;
		this.Course_Instructor=ci;
		this.Course_Credits=c.Course_Credits;
	}
	void display(){
		System.out.println("Course Name is ==> "+Course_Name);
		System.out.println("Course Instructor is ==> "+Course_Instructor);
		System.out.println("Course Credit is ==> "+Course_Credits+"\n\n");
	}		
}
class Course_Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter c1 Course_Name , Course_Instructor , Course_Credits : ");
		Course c1 = new Course(sc.next(),sc.next(),sc.nextDouble());
		System.out.print("Enter c1 Course_Name , Course_Instructor (Use of Copy Constructor): ");
		Course c2 = new Course(sc.next(),sc.next(),c1);
		System.out.print("\n\nFor c1:\n");
		c1.display();
		System.out.print("\n\nFor c2:\n");
		c2.display();
	}
}