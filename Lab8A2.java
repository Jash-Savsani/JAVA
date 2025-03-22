/*Write a program that illustrates interface inheritance. Interface A is extended by A1 and A2. 
Interface A12 inherits from both A1 and A2.Each interface declares one constant and one method. 
Class B implements A12.Instantiate B and invoke each of its methods. Each method displays one of the constants.*/
interface A{
	final int i = 10;
	void display_i();
}
interface A1 extends A{
	final int j = 15;
	void display_j();
}
interface A2 extends A{
	final int k = 20;
	void display_k();
}
interface A12 extends A1 , A2{
	final int l = 25;
	void display_l();
}
class B implements A12{
	public void display_i(){
		System.out.println("display_i="+i);
	}
	public void display_j(){
		System.out.println("display_j="+j);
	}
	public void display_k(){
		System.out.println("display_k="+k);
	}
	public void display_l(){
		System.out.println("display_l="+l);
	}
	B(){
		display_i();
		display_j();
		display_k();
		display_l();
	}
}
class Lab8A2{
	public static void main(String[] args) {
	B b1 = new B();	
	}
}