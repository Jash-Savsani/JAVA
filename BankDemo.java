import java.util.Scanner;
class Account{
	int accNum;
	String accType;
	double balance;
	void setter(int accNum,String accType,double balance){
		this.accNum = accNum;
		this.accType = accType;
		this.balance = balance;		
	}
	void getter(){
		System.out.println("Account Number:"+this.accNum);
		System.out.println("Account Type:"+this.accType);
		System.out.println("Account Balance:"+this.balance);
	}
}
class BankDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a1 = new Account();
		Account a2 = new Account();
		Account a3 = new Account();
		int accNum;
		String accType;
		double balance;
		System.out.print("Enter Account Number for a1:");
		accNum = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Account Type for a1:");
		accType = sc.nextLine();
		System.out.print("Enter Account Balance for a1:");
		balance = sc.nextDouble();
		a1.setter(accNum,accType,balance);
		a1.getter();
		System.out.print("Enter Account Number for a2:");
		accNum = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Account Type for a2:");
		accType = sc.nextLine();
		System.out.print("Enter Account Balance for a2:");
		balance = sc.nextDouble();
		a2.setter(accNum,accType,balance);
		a2.getter();
		System.out.print("Enter Account Number for a3:");
		accNum = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Account Type for a3:");
		accType = sc.nextLine();
		System.out.print("Enter Account Balance for a3:");
		balance = sc.nextDouble();
		a3.setter(accNum,accType,balance);
		a3.getter();		
	}
}