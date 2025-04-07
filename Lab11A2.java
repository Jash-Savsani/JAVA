/*Write an application that executes two threads. One thread 
displays "Good Morning" every 1000 milliseconds & another thread displays "Good Afternoon" every 3000 milliseconds. 
Create the threads by implementing the Runnable interface*/
class A implements Runnable{
	Thread t1;
	A(){
		t1 = new Thread(this,"t1");
		t1.start();
	}
	public void run(){
		for(int i=1;i<10;i++){
		System.out.println("Good Morning");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){

		}	
	}
		
	}
}
class B implements Runnable{
	public void run(){
		for(int i=1;i<10;i++){
			System.out.println("Good Afternoon");
			try{
				Thread.sleep(3000);
			}catch(InterruptedException e){

			}	
		}	
	}
}
class Lab11A2{
	public static void main(String[] args) {	
			B b1 = new B();
			Thread t2 = new Thread(b1);
			t2.start();
			A a1 = new A();
		}	
}