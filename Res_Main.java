/*Write a Java program to create a class called "Restaurant" with attributes for menu items, prices, and ratings. 
Define no-argument constructor and parameterized constructor to set values. 
Calculate average rating using double avg().*/
import java.util.Scanner;
class Restaurant{
	int menu_items;
	int[] price;
	double[] ratings; 
	Restaurant(){
	Scanner sc = new Scanner(System.in);
		System.out.print("Enter Total Number Menu Items: ");
		this.menu_items=sc.nextInt();
		price = new int[menu_items];
		ratings = new double[menu_items];
		for(int i=0;i<menu_items;i++){
			System.out.print("Enter item["+i+"] Price: ");
			price[i]=sc.nextInt();
		}
		for(int i=0;i<menu_items;i++){
			System.out.print("Enter item["+i+"] Credit(Rating): ");
			ratings[i]=sc.nextDouble();
		}
	}
	Restaurant(int menu_items){
		Scanner sc = new Scanner(System.in);
		this.menu_items=menu_items;
		price = new int[menu_items];
		ratings = new double[menu_items];
		for(int i=0;i<menu_items;i++){
			System.out.print("Enter item["+i+"] Price: ");
			price[i]=sc.nextInt();
		}
		for(int i=0;i<menu_items;i++){
			System.out.print("Enter item["+i+"] Credit(Rating): ");
			ratings[i]=sc.nextDouble();
		}
	}
	double avg(){
		double sum=0;
		for(int i=0;i<menu_items;i++){
			sum+=ratings[i];
		}
		sum=(sum / (menu_items));
		return sum;
	} 
}
class Res_Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("For r1:\n");
		Restaurant r1 = new Restaurant();
		System.out.print("\n\nFor r2 (Enter Number of Menu Items):");
		Restaurant r2 = new Restaurant(sc.nextInt());
		double rat1 = r1.avg();
		double rat2 = r2.avg();
		System.out.print("\n\nAverage Rate of r1 is: "+rat1+"\nAverage Rate of r2 is: "+rat2);
	}
}