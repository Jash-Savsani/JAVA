import java.util.Scanner;
class Member{
	String name;
	int age;
	long phone_number;
	String address;
	double salary;
	Member(String name,int age,long phone_number,String address,double salary){
		this.name=name;
		this.age=age;
		this.phone_number=phone_number;
		this.address=address;
		this.salary=salary;
	}
	void displaysalary(){
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Phone Number :"+phone_number);
		System.out.println("Address:"+address);
		System.out.println("Salary:"+salary);
	}
}
class Employee extends Member{
	String sp;
	Employee(String name,int age,long phone_number,String address,double salary, String sp){
		super(name , age , phone_number , address ,salary);
		this.sp = sp;
	}
	void displaysalary(){
		super.displaysalary();
		System.out.println("Specialization:"+sp);
	}
}
class Manager extends Member{
	String dp;
	Manager(String name,int age,long phone_number,String address,double salary,String dp){
		super(name , age , phone_number , address ,salary);
		this.dp = dp;
	}
	void displaysalary(){
		super.displaysalary();
		System.out.println("Department:"+dp);	
	}

}
class Lab7B3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		long phone_number;
		String address;
		double salary;
		String sp;
		String dp;
		System.out.print("Enter Name:");
		name = sc .nextLine();
		System.out.print("Enter Age:");
		age = sc .nextInt();
		System.out.print("Enter Phone Number:");
		phone_number = sc .nextLong();
		sc.nextLine();
		System.out.print("Enter Address:");
		address = sc .nextLine();
		System.out.print("Enter Salary:");
		salary = sc .nextDouble();
		sc.nextLine();
		System.out.print("Enter Specialization:");
		sp = sc .nextLine();
		Employee e1 = new Employee(name, age , phone_number , address , salary ,sp);
		System.out.print("Enter Name:");
		name = sc .nextLine();
		System.out.print("Enter Age:");
		age = sc .nextInt();
		System.out.print("Enter Phone Number:");
		phone_number = sc .nextLong();
		sc.nextLine();
		System.out.print("Enter Address:");
		address = sc .nextLine();
		System.out.print("Enter Salary:");
		salary = sc .nextDouble();
		sc.nextLine();
		System.out.print("Enter Department:");
		dp = sc .nextLine();	
		Manager m1 = new Manager(name, age , phone_number , address , salary ,dp);
		e1.displaysalary();
		m1.displaysalary();
	}
}