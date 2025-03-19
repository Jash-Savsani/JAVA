/*final*/class A{
	 	/*final*/int i=200;
		/*final*/void display(){
		System.out.println("Jash"+i+" ");
	}
}
class B extends A{
	
	void display(){
		super.display();
		System.out.println("Savsani"+i+" ");
		super.i=400;
	}
}
class Lab7A5{
	public static void main(String[] args) {
		B b1 = new B();
	}
}