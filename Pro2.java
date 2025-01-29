import java.util.Scanner;
class Math{
	void arithMetic(int i){
		System.out.println("Multiplication is: "+(i*0));
	}
	void arithMetic(int i, int j){
		System.out.println("Multiplication is: "+(i*j));
	}
	void arithMetic(int i, int j, int k){
		System.out.println("Multiplication is: "+(i*j*k));
	}
}
class Pro2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Math m = new Math();
		m.arithMetic(42,15);
		m.arithMetic(12);
		m.arithMetic(12,10,12);
	}
}