/*The Transport interface declares a deliver () method. 
The abstract class Animal is the super class of the Tiger, Camel, Deer and Donkey classes. 
The Transport interface is implemented by the Camel and Donkey classes. 
Write a test program that initialize an array of four Animal objects. 
If the object implements the Transport interface, the deliver () method is invoked.*/
/*if(arr[j]instanceofTransport){
	(Transport)arr[j].deliver();	
}*/
interface Transport{
	public void deliver();
}
abstract class Animal{
	abstract void timePass();																											
}
class Tiger extends Animal{
	public void timePass(){
		System.out.println("Tiger is Jash Patel.");
	}
}
class Camel extends Animal implements Transport{
	public void deliver(){
		System.out.println("Camel is Transport.");
	}
	public void timePass(){
		System.out.println("Camel is Ritik Roshan.");
	}	
}
class Deer extends Animal{
	public void timePass(){
		System.out.println("Deer is Akshy Kumar.");
	}
}
class Donkey extends Animal implements Transport{
	public void deliver(){
		System.out.println("Donkey is Transport.");
	}
	public void timePass(){
		System.out.println("Donkey is Other All.");
	}
}
class Lab8A3{
	public static void main(String[] args) {
		Animal[] arr = new Animal[4];
		arr[0] = new Tiger();
		arr[1] = new Camel();
		arr[2] = new Deer();
		arr[3] = new Donkey();
		for(int i=0;i<4;i++){
			if(arr[i] instanceof Transport){
				((Transport)arr[i]).deliver();	
			}
				arr[i].timePass();	
		}
	}
}