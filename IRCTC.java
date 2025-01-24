import java.util.*;
class IRCTC{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\nWlecome To IRCTC Online Train Ticket Website:\n\n");
		System.out.print("For How Many Person ,You Want to Buy Ticket:");
		int prize=sc.nextInt();
		System.out.print("\n\n");
		System.out.print("FROM:\n1.Junagadh(JUN)\n2.Rajkot(RAJ)\n3.Ahmedabad(AHMD)\n4.Gandhinagar(GND)\n");
		System.out.print("From Where Are you want to Start Jounary:");
		String city1=sc.next();
		System.out.print("\n\n");
		System.out.print("TO:\n1.Junagadh(JUN)\n2.Rajkot(RAJ)\n3.Ahmedabad(AHMD)\n4.Gandhinagar(GND)\n");
		System.out.print("From "+city1+" Where Are you want to Go:");
		String city2=sc.next();
		System.out.print("\n\n");
		System.out.print("Enter DATE/MONTH/YEAR for Jounary "+city1+" to "+city2+":");
		String date=sc.next();
		System.out.print("\n\n");
		System.out.print("Classes:\n1.AC First Class(1A)\n2.Vistadome AC(EV)\n3.AC 2 Tire(2A)\n4.First Class(FC)\n5.AC Chair Car(CC)\n6.Sleeper(SL)\n7.Vistadome No AC(VS)\n8.Second Setting(2S)\n");
		System.out.print("Enter to Which Type of Train Class ypu Want to Choose From Given Options,\nPlease Enter it's Index Number:");
		int index1=sc.nextInt();
		String cls="";
		if(index1==1){
			cls="1A";
			}
		else if(index1==2){
			cls="EV";
			}
		else if(index1==3){
			cls="2A";
			}
		else if(index1==4){
			cls="FC";
			}
		else if(index1==5){
			cls="CC";
			}
		else if(index1==6){
			cls="SL";
			}
		else if(index1==7){
			cls="VS";
			}
		else if(index1==8){
			cls="2S";
			}
		else
		{
			System.out.print("\n\nSorry.......\nYou have Enter Invalid Integer, Sorry Please Return Back and Try again For Booking Process....");
		}
		System.out.print("\n\n");
		System.out.print("General:\n1.LADIES\n2.SR.CITIZENS\n3.PERSON WITH DISABBILITY\n4.DUTY PASS\n5.TATKAL\n6.PREMIUM TATKAL\n");
		System.out.print("Enter General Category From Given Options,\nPlease Enter it's Index Number:");
		int index2=sc.nextInt();
		String general="";
		if(index2==1){
			general="LADIES";
			}
		else if(index2==2){
			general="SR.CITIZENS";
			}
		else if(index2==3){
			general="PERSON WITH DISABBILITY";
			}
		else if(index2==4){
			general="DUTY PASS";
			}
		else if(index2==5){
			general="TATKAL";
			}
		else if(index2==6){
			general="PREMIUM TATKAL";
			}
		else
		{
			System.out.print("\n\nSorry.......\nYou have Enter Invalid Integer, Sorry Please Return Back and Try again For Booking Process....");
		}
		System.out.print("\n\n");
		System.out.print("YOUR LUCK IS GOOD, \nHere Ticket is available for as needed you at: "+(index1+index2)+":00 Hour.\n");
		System.out.print("Are You Really want to Booking Ticket Please Confrom by YES or NO:");
		String conform=sc.next();
		System.out.print("\n\n\n\n");
		if(conform.equals("YES"))
		{
			int ta =(index1*index2*17*prize);//TOTAL AMOUNT
			for(int i=1;i<=33;i++){
			System.out.print("__");
		}
		System.out.print("\n\n");
		for(int i=1;i<=11;i++){
			System.out.print(" ");
		}
		System.out.print("   IRCTC   ONLINE   TRAIN   BOOKING");
		System.out.print("\n\n");
		for(int i=1;i<=33;i++){
			System.out.print("__");
		}
	 	System.out.print("\nFROM\tTO\tDATE\tCLASSTYPE\tGENERAL\t   TOTALAMOUNT\n\n");
	 	System.out.print(city1+"\t"+city2+"\t"+date+"    "+cls+"\t\t"+ general+"    "+ta);//here is two error
		System.out.print("\n");
		for(int i=1;i<=33;i++){
			System.out.print("__");
		}
		System.out.print("\n");
		for(int i=1;i<=33;i++){
			System.out.print("__");
		}
		}
		else if(conform.equals("NO")){
			System.out.print("Fine!  It's OK,\nWe will meet Again.\nTHANKS FOR VISITING OUR IRCTC WEBSITE:\n\n");
		}

	}
}