//Simple Inheritance
class A{
	int i=10;
	int j=20;
}
class B extends A{
	int k=30;
	B(){
		System.out.print("i+j+k="+(i+j+k));
	}
}
class Simple_Inheri{
	public static void main(String[] args) {
		B b1 = new B();
	}
}