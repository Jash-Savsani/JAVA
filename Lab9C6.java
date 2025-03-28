/*Write a Java program to create an interface Playable with a method play() that takes no arguments and returns void. 
Create three classes Football, Volleyball, and 
Basketball that implement the Playable interface and override the play() method to play the respective sports. [C]*/
interface Playable{
	void play();
}
class Football{
	Football(){
		play();
	}
	public void play(){
		System.out.println("Playing Football.");
	}
}
class Volleyball{
	Volleyball(){
		play();
	}
	public void play(){
		System.out.println("Playing Volleyball.");
	}
}
class Basketball{
	Basketball(){
		play();
	}
	public void play(){
		System.out.println("Playing Basketball.");
	}
}
class Lab9C6{
	public static void main(String[] args) {
		new Football();
		new Volleyball();
		new Basketball();				
	}		
}