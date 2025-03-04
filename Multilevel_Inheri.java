//Multilevel Inheritance
class A{
	int i=10;
	int j=20;
	A(){
		System.out.print("\ni+j="+(i+j));
	}
}
class B extends A{
	int k=30;
	B(){
		System.out.print("\ni+j+k="+(i+j+k));
	}
}
class C extends B{
	int l = 40 ;
	C(){
		System.out.print("\ni+j+k+l="+(i+j+k+l));
	}
}
class Multilevel_Inheri{
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
	}
}