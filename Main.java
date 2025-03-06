import java.util.Scanner;
class A{
	int[] a= new int[5];
	void sortArray(int[] a){
		this.a = a;
		int temp;
		for(int i=1; i<a.length ;i++){
			for(int j=1; j<a.length ;j++){
				if(a[j]<a[j-1]){
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		};
		for(int i=0;i<a.length;i++){
			System.out.println("Shorted Array is:")
			System.out.println("a["+i+"]:"+a[i]);
		}
	}
	void searchArray(int[] a, int temp){
		this.a = a;
		boolean b = false;
		for(int i=0;i<5;i++){
			if(temp==a[i]){
				System.out.println(temp+" is Found in Array in "+i+" Index.");
				b = true;
			}
		}
		if(b==false){
			System.out.print(temp+" is Found in Array.");
		}
	}
	void sumArray(int[] a){
		this.a=a;
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		System.out.println("Sum of Array:"+sum);		
	}
	void avgArray(int[] a){
		this.a=a;
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		double avg = (double) sum/a.length;
		System.out.println("Average of Array:"+avg);
	}
}
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A o1 = new A();
		int a[] = new int[5];
		for(int i=0;i<5;i++){
			System.out.print("Enter a["+i+"]:");
			a[i] = sc.nextInt();
		}
		System.out.print("Enter Your Search Element:");
		int temp = sc.nextInt();
		o1.searchArray(a,temp);
		o1.sortArray(a);
		o1.sumArray(a);
		o1.avgArray(a);
	}
}