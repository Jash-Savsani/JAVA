import java.util.Scanner;
class Train{
	public static int trainNo;
	private static String trainName;
	void displayTrainInfo(){
		
	}
	static class Engine{
		int engineNo;
		String fule;
		Engine(int tnum, String tname, int en){
			trainNo=tnum;
			trainName=tname;
			engineNo=en;
		}
		void displayENo(){
			System.out.println("Train Number is : "+trainNo);
			System.out.println("Train Name is : "+trainName);
			System.out.println("Engine Number is : "+engineNo);
		}
	}
}
class TrainMain{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Train t1 = new Train();
		System.out.print("Enter Train Number , Train Name , Engine Number : ");
		Train.Engine e1 = new Train.Engine(sc.nextInt(),sc.next(),sc.nextInt());
		e1.displayENo();
	}
}