import java.util.Scanner;
class Bank{
	long accontNumber;
	int balance;
	Bank(long accontNumber, int balance)
	{
		this.accontNumber=accontNumber;
		this.balance=balance;
	}
	void display()
	{
		System.out.println("Current Balance is: "+balance);
	}
	void Debit(int amt){
		if(balance-amt<10000){
			System.out.println("Sorry Transiction is fail.. \nYour balance will go less than 10000 that is not Valid beyond Rules.");
		}
		else{
			balance-=amt;
			System.out.println("Debit Amount is: "+amt);
		}
	}
	void Credit(int amt){
		balance+=amt;
		System.out.println("Credit Amount is: "+amt);
	}

}
class Bank_App{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Bank Account Number and Balance for b1: ");
		Bank b1 = new Bank(sc.nextLong(),sc.nextInt());
		do
		{
			System.out.println("\n\n1. Check Balance:\n2.Credit Balance:\n3.Debit Balance:\n4.Exit:");
			System.out.print("Enter a Number for Use Above Functionality: ");
			switch(sc.nextInt()){
			case 1: System.out.print("\n\n");
					b1.display();
					break;
			case 2:	System.out.print("\n\n");
					System.out.print("Enter Credit Amount: ");
					b1.Credit(sc.nextInt());
					b1.display();
					break;
			case 3:	System.out.print("\n\n");
					System.out.print("Enter Debit Amount: ");
					b1.Debit(sc.nextInt());
					b1.display();
					break;
			case 4:System.exit(0);
			default : System.out.println("Envalid Number.");
			}
		}while(true);	
	}
}