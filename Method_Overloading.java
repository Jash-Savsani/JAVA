import java.util.Scanner;
class Student{
	String name;
	int sem;
	double cpi;
	void dispData(String n, int s, double c){
		name=n;
		sem=s;
		cpi=c;
		System.out.println("NAME="+name+"\tSEM="+sem+"\tCPI="+cpi);
	}
	void dispData(String n, int s){
		name=n;
		sem=s;
		System.out.println("NAME="+name+"\tSEM="+sem);
	}
	void dispData(String n){
		name=n;
		System.out.println("NAME="+name);
	}
}
class Method_Overloading{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		s.dispData("Jash");//here you,
		s.dispData("Alpeshbhai",5);//can see
		s.dispData("Shilpaben",5,9.9);//method overloading.
	}
}