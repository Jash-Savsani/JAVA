/*The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato. 
Write a java program that demonstrates how to establish this class hierarchy. 
Declare one instance variable of type String that indicates the color of a vegetable. 
Crete and display instances of these objects. Override the toString() method of object to return a string 
with the name of vegetable and its color.*/
import java.util.Scanner;
abstract class Vegetable{
	String veg_name;
	String veg_color;
	abstract public String toString();
}
class Potato extends Vegetable{
	Potato(String veg_name , String veg_color){
		super.veg_name=veg_name;
		super.veg_color=veg_color;
		System.out.println(toString());
	}
	public String toString(){
		return "Color of "+veg_name+" is "+veg_color;
	}
}
class Brinjal extends Vegetable{
	Brinjal(String veg_name , String veg_color){
		super.veg_name=veg_name;
		super.veg_color=veg_color;
		System.out.println(toString());
	}
	public String toString(){
		return "Color of "+veg_name+" is "+veg_color;
	}
}
class Tomato extends Vegetable{
	Tomato(String veg_name , String veg_color){
		super.veg_name=veg_name;
		super.veg_color=veg_color;
		System.out.println(toString());
	}
	public String toString(){
		return "Color of "+veg_name+" is "+veg_color;
	}
}
class Lab8A1{
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Vegetable Name:");
			String veg_name=sc.nextLine();
			System.out.print("Enter Color of "+veg_name+":");
			String veg_color=sc.nextLine();
			if(veg_name.equals("Potato")){
				Potato p1 = new Potato(veg_name , veg_color);
				System.out.print(p1);
			}
			else if(veg_name.equals("Tomato")){
				Tomato t1 = new Tomato(veg_name , veg_color);
				System.out.print(t1);
			}
			else if(veg_name.equals("Brinjal")){
				Brinjal br1 = new Brinjal(veg_name , veg_color);
				System.out.print(br1);
			}
			else{
				System.out.print("Envalid Veg Name.");
			}
			
		}	
}