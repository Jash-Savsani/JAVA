/*Create a class named Bank_Account with data memebers accountNo, userName, email, accountType 
and accountBalance,Also create methods getAccountDetails() and displayAccountDetails().*/
import java.util.Scanner;
class Bank_Account{
	Scanner sc = new Scanner(System.in);
	long accountNo;
	String userName;
	String email;
	int accountBalance;
	String accountType;
	void getAccountDetails(){
		System.out.print("Enter Your Name:");
		String userName = sc.nextLine();
		System.out.print("Enter Your Bank Account Number:");
		long accountNo = sc.nextLong();
		sc.nextLine();
		System.out.print("Enter Your E-Mail:");
		String email =sc.nextLine();
		System.out.print("Enter Your Bank Account Balance:");
		int accountBalance = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Your Bank Account Type:");
		String accountType = sc.nextLine();
		this.accountNo=accountNo;
		this.userName=userName;
		this.email=email;
		this.accountType=accountType;
		this.accountBalance=accountBalance;
	}
	void displayAccountDetails(){
		System.out.println("Bank Account Number is: "+accountNo);
		System.out.println("Bank User Name is: "+userName);
		System.out.println("User Email is: "+email);
		System.out.println("Account Balance is: "+accountBalance);
		System.out.println("Bank Account Type is: "+accountType);
	}
	


}
class Lab6A4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank_Account p1 = new Bank_Account();
		p1.getAccountDetails();
		System.out.print("\n\n");
		p1.displayAccountDetails();
	}
}