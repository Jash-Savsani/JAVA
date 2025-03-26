/*Create interface EventListener with performEvent() method. Create MouseListener interface which inherits 
EventListener along with mouseClicked(), mousePressed(), mouseReleased(), mouseMoved(), mouseDragged() methods. Also 
create KeyListener interface which inherits EventListener along with keyPressed(), keyReleased() methods. WAP to 
create EventDemo class which implements MouseListener and KeyListener and demonstrate all the methods of the interfaces.*/
interface EventListener{
	void performEvent();
}
interface MouseLister extends EventListener{
	void mouseClicked();
	void mousePressed();
	void mouseReleased();
	void mouseMoved();
	void mouseDragged();
}
interface KeyListener extends EventListener{
	void keyPressed();
	void keyReleased();
}
class EventDemo implements MouseLister , KeyListener{
	EventDemo(){
		performEvent();
		mouseClicked();
		mousePressed();
		mouseReleased();
		mouseMoved();
		mouseDragged();
		keyPressed();
		keyReleased();
	}
	public void performEvent(){
		System.out.println("Calling performEvent.");
	}
	public void mouseClicked(){
		System.out.println("Calling mouseClicked. ");
	}
	public void mousePressed(){
		System.out.println("Calling mousePressed. ");
	}
	public void mouseReleased(){
		System.out.println("Calling mouseReleased. ");
	}
	public void mouseMoved(){
		System.out.println("Calling mouseMoved. ");
	}
	public void mouseDragged(){
		System.out.println("Calling mouseDragged. ");
	}
	public void keyPressed(){
		System.out.println("Calling keyPressed. ");
	}
	public void keyReleased(){
		System.out.println("Calling keyReleased. ");
	}
}
class Lab9A4{
	public static void main(String[] args) {
		EventDemo ed = new EventDemo();
	}
}