import java.util.Scanner;
class MyBank{
	int accNum;
	String accType;
	double balance;
	MyBank(){
		this.balance=10000;
	}
	MyBank(int accNum, String accType, double balance){
		this.accNum=accNum;
		this.accType=accType;
		this.balance=10000+balance;
	}
	void creditAmt(double amt){
		this.balance=this.balance+amt;
		System.out.println("credited amt="+amt);
	}
	void debitAmt(double amt){
		this.balance=this.balance-amt;
		System.out.println("debited amt="+amt);
	}
	void displayBal(){
		System.out.println("Acc_Num="+accNum+"\nbal="+balance);
	}
}
public class MyBankDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyBank mb1 = new MyBank();
		MyBank mb2 = new MyBank(2222,"salary",0);
		MyBank mb3 = new MyBank(3333,"saving",20000);
		MyBank mb4 = new MyBank(4444,"saving",40000);
		mb1.displayBal(); 
		mb2.displayBal(); 
		mb3.displayBal(); 
		mb3.creditAmt(400); 
		mb3.displayBal();
		System.out.print("Enter Credit Amount for mb4: ");
		int amt=sc.nextInt();
		mb4.creditAmt(amt);
		System.out.print("Enter Debit Amount for mb4: ");
		amt=sc.nextInt();
		mb4.debitAmt(amt);
		mb4.displayBal();
	}
}