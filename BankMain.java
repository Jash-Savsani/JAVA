import java.util.Scanner;
class BankAcc{
	int acc_num;
	double balance;
	static String bankName="Jash_DU";
	BankAcc(int acc_num, double balance){
		this.acc_num = acc_num;
		this.balance = balance;
	}
	void display(){
		System.out.println(" Account Num: "+acc_num+" and Balance: "+balance+"Rs. and BankName: "+bankName);
	}


}
class BankMain{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No. of Bank Accounts: ");
		int n = sc.nextInt();
		BankAcc[] b = new BankAcc[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter b["+i+"] Account Num and Balance: ");
			b[i]= new BankAcc(sc.nextInt(),sc.nextDouble());
		}
		for(int i=0;i<n;i++)
		{
			System.out.print("\nFor b["+i+"]===> ");
			b[i].display();
		}

	}
	static{
			System.out.println("WELCOME TO 'JASH_DU' BANK:");
		}
}