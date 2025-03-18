class A{
	int i;
	int j;
	A(int i){
		this.i=i;
	}
	void display(){
		System.out.println("(PARENT)i+j="+(i+j));
	}
}
class B extends A{
	int j;
	int k;
	B(int i, int j, int k){
		super(i);
		super.j=30;
		this.j=j;
		this.k=k;
	}
	void display(){
		super.display();
		System.out.println("(CHILD)i+j+k="+(i+j+k));
	}
}
class Lab7A4{
	public static void main(String[] args) {
		B b1 = new B(10,20,40);
		b1.display();
	}
}