class A implements Runnable{
	Thread t1;
	A(){
		t1= new Thread(this,"t1");
		t1.start();
	}
	public void run(){
		System.out.println("I'm a1 Thread");
		for(int i=1;i<=10;i++){
			System.out.println("a1 :"+i);
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){

			}
		}
	}
} 
class Lab11A1_2{
	public static void main(String[] args) {
		Thread t1 = new Thread();
		A a1 = new A();
		for(int i=1;i<=10;i++){
			System.out.println("Main :"+i);
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){

			}
		}
	}
}