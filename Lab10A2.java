/*Write a program to create Account class, which is representing a bank account where we can deposit and withdraw money. 
If user need to withdraw money which exceed our minimum bank balance then it will not be allowed, 
and will throw InSufficientFundException(Custom Exception). 
Handle above exception and display proper error message*/
import java.util.Scanner;
class InSufficientFundException extends Exception{
	InSufficientFundException(String msg){
		super(msg);
	}
}
class Account{
	int money;
	long accNo;
	String accName;
	Account(int money, long accNo,String accName){
		this.money=money;
		this.accNo=accNo;
		this.accName=accName;
	}
	void deposit(int balance){
		this.money+=balance;
		System.out.print("\n\nWith DEPOSITE Your Balance:"+this.money+"\n\n");
	}
	void withdraw(int balance) throws Exception{
		if(this.money-balance<500){
			throw new InSufficientFundException("You can't withdraw within 500Rs.");
		}	
		this.money-=balance;
		System.out.print("\n\nWith WITHDRAW Your Balance:"+this.money+"\n\n");
	}
}
class Lab10A2{
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int balance;//for deposite, withdreaw
		int money;
		long accNo;
		String accName;
		System.out.print("Enter Money:");
		money = sc.nextInt();
		System.out.print("Enter Account Number:");
		accNo = sc.nextLong();
		sc.nextLine();
		System.out.print("Enter AccountName:");
		accName = sc.nextLine();
		Account ac1 = new Account(money,accNo,accName);
		do{
			System.out.println("\n\n1.Deposit Money\n2.Withdrow Money\n3.Exit\n\n");
			if(sc.nextInt()==1){
				System.out.print("Enter Balance for Deposite:");
				ac1.deposit(sc.nextInt());
			}
			else if(sc.nextInt()==2){
				System.out.print("Enter Balance for Withdrow:");
				ac1.withdraw(sc.nextInt());
			}
			else{
				break;
			}
		}while(true);
	}
}