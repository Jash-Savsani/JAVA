/*WAP to implement the solution to producer consumer problem in Java.*/
class Product{
	int item;
	synchronized void put(int item){
		this.item=item;
		System.out.println("Put :"+this.item);
	} 
	synchronized int get(){
		return this.item;
	}
}
class Producer extends Thread{
	Product prodt;
	Producer(Product prodt){
		this.prodt=prodt;
		start();
	}
	public void run(){
		for(int i=1;i<=10;i++){
			prodt.put(i);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
							
			}
		}
	}

}
class Costmer extends Thread{
	Product prodt;
	Costmer	(Product prodt){
		this.prodt=prodt;
		start();
	}
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("Get :"+prodt.get());
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){

			}
		}
	}
}
class Lab11A3{
	public static void main(String[] args) {
		Product prodt = new Product();
		Producer p1 = new Producer(prodt);
		Costmer c1 = new Costmer(prodt);
	}
}
