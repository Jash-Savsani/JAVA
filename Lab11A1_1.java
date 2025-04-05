/*Write a java Multithread program [A]
i. Using Thread class.*/
class A extends Thread{
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
class Lab11A1_1{
	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		System.out.println("I'm Main Thread");
		for(int i=1;i<=10;i++){
			System.out.println("Main :"+i);
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){

			}
		}			
	}	
}