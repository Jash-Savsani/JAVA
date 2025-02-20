/*Write a Java program to create a class called "Person" with a name and age attribute. 
Create two instances of the "Person" class p1 and p2, set their attributes using the parameterized constructor, 
and print their name and age.*/
import java.util.Scanner;
class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
}
class Person_Main{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Name and Age for Person p1 :");
		Person p1 = new Person(sc.next(),sc.nextInt());
		System.out.print("Enter Name and Age for Person p2 :");
		Person p2 = new Person(sc.next(),sc.nextInt());
		System.out.print("\n\nName of Person p1 is : "+p1.name+"\nName of Person p2 is : "+p2.name);
		System.out.print("\n\nAge of Person p1 is : "+p1.age+"\nAge of Person p2 is : "+p2.age);
	}
}