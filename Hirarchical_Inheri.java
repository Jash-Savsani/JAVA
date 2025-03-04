//Hirarchical Inheritance
class A{
	int i=10;
	int j=20;
}
class B extends A{
	int k=30;
	B(){
		System.out.print("\ni+j+k="+(i+j+k));
	}
}
class C extends A{
	int l = 40 ;
	B b1 = new B();
	C(){
		System.out.print("\ni+j+b1.k+l="+(i+j+b1.k+l));
	}
}
class Hirarchical_Inheri{
	public static void main(String[] args) {
		B b2 = new B();
		C c1 = new C();	
	}
}