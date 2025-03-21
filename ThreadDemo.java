/*GOOD EVENING, GOOD AFTERNOON, GOODNIGHT*/	/*IMP PROGRAM FOR ALL TYPES OF THREAD CREATING*/
class A extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("\t\t\tGood Morning: "+i);
			try{
				Thread.sleep(5000);
			}catch(InterruptedException e){

			}
		}
	}
}
class B implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("Good Afternoon: "+i);
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){

			}
		}		
	}
}
class C implements Runnable{
	Thread t3;
	C(){
		t3 = new Thread(this,"t3");
	}
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("Good Night: "+i);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){

			}
		}
	}
}
class ThreadDemo{
	public static void main(String[] args) {
		A t1 = new A();
		B b1 = new B();
		Thread t2 = new Thread(b1);
		C c1 = new C();
		t1.start();
		t2.start();
		c1.t3.start();
	}
}