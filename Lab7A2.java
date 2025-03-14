/*Declare a class called book having author_name as private data member. Extend book class to have two sub classes 
called book_publication & paper_publication. Each of these classes have private member called title. 
Write a complete program to show usage of dynamic method dispatch 
(dynamic polymorphism) to display book or paper publications of given author.Use command line arguments for input data.*/
class Book{/*Dynamic Polymorphisum = Run-time Polymorphisum*/
	private String author_name;
	Book(String author_name)
	{
		this.author_name=author_name;
	}
	void display(){
		System.out.println("Book Author Name:"+author_name);	
	}
}
class Book_Publication extends Book{
	private String title;
	Book_Publication(String author_name , String title){
		super(author_name);
		this.title=title;
		this.display();
	}
	void display(){
		super.display();
		System.out.println("Book Publication Name:"+this.title);
	}
}
class Paper_Publication extends Book{
	private String title;
	Paper_Publication(String author_name , String title){
		super(author_name);
		this.title=title;
		this.display();
	}
	void display(){
		super.display();
		System.out.println("Paper Publication Name:"+title);
	}
}
public class Lab7A2{/*Run time e Khabar padse ke Kya class no Obj. malse, theti aane Dynamic Polymorphisum = Run-time Polymorphisum kahe che.*/
	public static void main(String[] args) {
		if(args[0].equals("Paper")){
			Book b1 = new Paper_Publication(args[1] , args[2]);
		}
		else if(args[0].equals("Book"){
			Book b1 = new Book_Publication(args[1] , args[2]);
		}
		else{
			System.out.println("Envalid Input");
		}
	}
}